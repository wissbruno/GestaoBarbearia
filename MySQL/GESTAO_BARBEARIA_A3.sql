CREATE DATABASE gestao_barbearia;

USE gestao_barbearia;

CREATE TABLE usuario(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(75) NOT NULL,
usuario VARCHAR(50) NOT NULL UNIQUE,
senha VARCHAR(100) NOT NULL,
perfil VARCHAR(10) NOT NULL DEFAULT "PADRAO"
);

INSERT INTO usuario(nome, usuario, senha, perfil) VALUES ("Bruno Wiss", "wissbruno","123456", "ADMIN");
INSERT INTO usuario(nome, usuario, senha, perfil) VALUES ("Carlos Almeida", "almeida123", "123456", "PADRAO");
INSERT INTO usuario(nome, usuario, senha, perfil) VALUES ("Carol Santos", "santosca", "123456", "PADRAO");
INSERT INTO usuario(nome, usuario, senha, perfil) VALUES ("Breno Lopes", "lopesbreno", "123456", "PADRAO");
INSERT INTO usuario(nome, usuario, senha, perfil) VALUES ("Neymar Junior", "neymarjr", "123456", "PADRAO");

SELECT * FROM usuario;

CREATE TABLE cliente(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
telefone VARCHAR(20) NOT NULL,
endereco VARCHAR(100) NOT NULL
);

-- Exemplo de inserção de dados na tabela cliente
INSERT INTO cliente (nome, telefone, endereco)
VALUES 
    ('João Silva', '(11) 1234-5678', 'Rua A, 123'),
    ('Maria Oliveira', '(22) 9876-5432', 'Avenida B, 456'),
    ('Pedro Santos', '(33) 5555-1234', 'Travessa C, 789');


CREATE TABLE agendamentos(
id int PRIMARY KEY AUTO_INCREMENT,
nome varchar(220) NOT NULL UNIQUE,
telefone varchar(20) NOT NULL,
servicos varchar(220) NOT NULL DEFAULT "Cortes De Cabelos",
data datetime NOT NULL
);

SELECT * FROM agendamentos;

INSERT INTO agendamentos(nome, telefone, data) VALUES (
"Rodrigo Almeida", 
"(11)91234-5678", 
"2023-12-10 / 13:00");
INSERT INTO agendamentos(nome, telefone, data) VALUES (
"André Oliveira", 
"(11)93456-7890", 
"2023-12-10 / 14:00");
INSERT INTO agendamentos(nome, telefone, data) VALUES (
"Lucas Pereira", 
"(11)99876-5432",  
"2023-12-11 / 12:00");
INSERT INTO agendamentos(nome, telefone, data) VALUES (
"Gustavo Santos", 
"(11)95678-9012", 
"2023-12-11 / 15:00");
INSERT INTO agendamentos(nome, telefone, data) VALUES (
"Felipe Costa", 
"(11)97765-4321", 
"2023-12-14 / 16:00");


CREATE TABLE produto(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(75) NOT NULL UNIQUE,
descricao VARCHAR(200),
preco DECIMAL(10, 2) NOT NULL,
quantidade INT NOT NULL
);

INSERT INTO produto(nome, descricao, preco, quantidade) VALUES(
"Gel para Cabelo", "O melhor gel para ficar com o brilho no cabelo!", 15.00, 150);
INSERT INTO produto(nome, descricao, preco, quantidade) VALUES(
"Pomada Capilar", "a melhor pomada capilar, para ficar estiloso!", 30.00, 120);
INSERT INTO produto(nome, descricao, preco, quantidade) VALUES(
"Agua", "Água mineral, para se refrescar!", 5.00, 50);
INSERT INTO produto(nome, descricao, preco, quantidade) VALUES(
"Refri", "Refri sabor laranja, para dar aquela adoçada durante o corte!", 6.00, 50);

select * from produto;

CREATE TABLE servicos(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL UNIQUE,
preco DECIMAL(10,2) NOT NULL)
;

INSERT INTO servicos(nome, preco) VALUES(
"Corte de Cabelo", 30.00);
INSERT INTO servicos(nome, preco) VALUES(
"Barba", 25.00);

CREATE TABLE venda (
id INT PRIMARY KEY AUTO_INCREMENT,
total_venda DECIMAL(10, 2) NOT NULL,
valor_pago DECIMAL(10, 2) NOT NULL,
desconto DECIMAL(10, 2) NOT NULL,
cliente_id INT,
usuario_id INT NOT NULL,
CONSTRAINT fk_venda_cliente FOREIGN KEY (cliente_id) REFERENCES cliente(id),
CONSTRAINT fk_venda_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE historico_vendas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    total_venda DECIMAL(10, 2) NOT NULL,
    valor_pago DECIMAL(10, 2) NOT NULL,
    desconto DECIMAL(10, 2) NOT NULL,
    cliente_id INT NOT NULL,
    usuario_id INT NOT NULL,
    data_venda TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_historico_cliente FOREIGN KEY (cliente_id) REFERENCES cliente(id),
    CONSTRAINT fk_historico_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);
	
select * from historico_vendas;
    
-- Exemplo de inserção de dados no histórico de vendas
INSERT INTO historico_vendas (total_venda, valor_pago, desconto, cliente_id, usuario_id)
VALUES 
    (150.00, 120.00, 10.00, 1, 1),
    (80.00, 70.00, 5.00, 2, 2),
    (200.00, 180.00, 15.00, 3, 3);

