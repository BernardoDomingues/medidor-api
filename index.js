// Importa bibliotecas
const mqtt = require("mqtt");
require("dotenv").config();
var mysql = require("mysql");

// Configura conexão com o banco de dados
var con = mysql.createConnection({
  host: process.env.BD_HOST,
  user: process.env.BD_USER,
  password: process.env.BD_PASSWORD,
  port: 3306,
  database: process.env.BD_DATABASE,
});

// Configura conexão com servidor MQTT
const client = mqtt.connect({
  host: process.env.MQTT_BROKER_URL,
  port: 1883,
  clientId: parseInt(process.env.MQTT_CLIENT_ID),
});

// Conecta com o servidor MQTT
client.on("connect", () => {
  console.info("Conectado ao servidor MQTT");

  client.subscribe(process.env.MQTT_SUBSCRIBE_NAME, (err) => {
    if (err) {
      console.error("Erro ao se inscrever no tópico: ", err);
    } else {
      console.info("Inscrito no tópico:", process.env.MQTT_SUBSCRIBE_NAME + ", aguardando mensagens...");
    }
  });
});

// Conecta ao banco de dados
con.connect((err) => {
  if (err) {
    console.error("ERRO CONECTANDO AO BANCO DE DADOS: ", err);
  } else {
    console.info("Conectado ao Banco de Dados!");
  }
});

// Começa a escutar as mensagens enviadas pelo servidor MQTT
client.on("message", async (topic, message) => {
  console.info("Mensagem recebida do tópico:", topic);
  console.info("Conteúdo da mensagem:", JSON.parse(message.toString())); // Traduz dados BUFFER para JSON
  const data = JSON.parse(message.toString());// Traduz dados BUFFER para JSON
  const type = data.variable; // Busca dado "variable" para saber em qual coluna registrar
  const value = data.value; // Busca dado "value" para saber o valor a registrar na coluna
  const now = new Date(); // Objeto do tipo DATA do momento atual

  if (type === "PA") {
    // Caso a coluna seja PA, criar uma nova linha de registro
    const sql = "INSERT INTO medidor (pa, created_at) VALUES ?";
    const values = [[value, now]];
    try {
      con.query(sql, [values], (err, result) => {
        if (err) throw err;
        console.info("Numero de registros adicionados: " + result.affectedRows);
      });
    } catch (err) {
      console.error(err);
    }
  } else {
    // Caso contrario, registra na última linha criada
    const sql = `UPDATE medidor SET ${type} = ? WHERE id = (SELECT * FROM (SELECT id FROM medidor ORDER BY id DESC LIMIT 1) AS subquery)`;
    const values = value;
    try {
      con.query(sql, [values], (err, result) => {
        if (err) throw err;
        console.info(result.affectedRows + " registro(s) atualizados");
      });
    } catch (err) {
      console.error(err);
    }
  }
});

client.on("error", (err) => {
  console.error("Erro na conexão MQTT:", err);
});

client.on("close", () => {
  console.info("Conexão MQTT fechada");
});
