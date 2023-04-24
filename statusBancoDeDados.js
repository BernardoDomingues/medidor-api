// Importa bibliotecas
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

// Conecta ao banco de dados
con.connect((err) => {
  if (err) {
    console.error("ERRO NA CONEXÂO: ", err);
  } else {
    console.info("Conectado ao Banco de Dados!");
  }
});

// Mostra os bancos de dados disponíveis
con.query("SHOW DATABASES;", (err, result) => {
  if (err) {
    console.error("ERRO NA QUERY: ", err);
  }
  console.info("Resultado: ");
  console.log(result);
});