## PRÉ REQUISITOS

NodeJs instalado na máquina (`https://nodejs.org/en/download`) / (`sudo apt-get install -y nodejs`)
Arquivo .env com variáveis de ambiente

## PRIMEIROS PASSOS

Instalar as bibliotecas (`npm i`)

## COMANDOS

Conferir status da conexão com o medidor: `npm run mqtt-status`
Conferir status de conexão com o Bando de Dados MySQL da HostGator: `npm run bd-status`
Rodar o servidor node para escutar os envios do medidor e salvar no banco de dados: `npm run server`

## SCRIPT DE CRIAÇÃO DA TABELA DO BD

CREATE TABLE `resol068_medidorenergia01`.`medidor` ( `pa` DOUBLE NOT NULL , `pb` DOUBLE NOT NULL , `pc` DOUBLE NOT NULL , `pt` DOUBLE NOT NULL , `qa` DOUBLE NOT NULL , `qb` DOUBLE NOT NULL , `qc` DOUBLE NOT NULL , `qt` DOUBLE NOT NULL , `ua` DOUBLE NOT NULL , `ub` DOUBLE NOT NULL , `uc` DOUBLE NOT NULL , `freq` DOUBLE NOT NULL , `pfa` DOUBLE NOT NULL , `pfb` DOUBLE NOT NULL , `pfc` DOUBLE NOT NULL , `pft` DOUBLE NOT NULL , `ia` DOUBLE NOT NULL , `ib` DOUBLE NOT NULL , `ic` DOUBLE NOT NULL , `ept_g` DOUBLE NOT NULL , `ept_c` DOUBLE NOT NULL , `id` INT AUTO_INCREMENT NOT NULL , `created_at` TIMESTAMP NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

## VISUZALIZAR / EXPORTAR DADOS

Entrar na conta da HostGator ->
Servidores ->
cPanel ->
PHPMyAdmin ->
Clicar na tabela `medidor` no canto esquerdo ->
Clicar em Export na barra superior -> 
Selecionar CSV for MS Excel -> 
Go
