// Importa bibliotecas
const mqtt = require("mqtt");
require("dotenv").config();

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

// Começa a escutar as mensagens enviadas pelo servidor MQTT
client.on("message", async (topic, message) => {
  console.info("Mensagem recebida do tópico:", topic);
  console.info("Conteúdo da mensagem:", JSON.parse(message.toString())); // Traduz dados BUFFER para JSON
});

client.on("error", (err) => {
  console.error("Erro na conexão MQTT:", err);
});

client.on("close", () => {
  console.info("Conexão MQTT fechada");
});
