-- Criar banco de dados
CREATE DATABASE sistema_veiculos;
USE sistema_veiculos;

-- Tabela pai
CREATE TABLE Veiculo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(10) NOT NULL,
    ano INT NOT NULL
);

-- Caminhao herda de Veiculo
CREATE TABLE Caminhao (
    id INT PRIMARY KEY,
    eixos INT NOT NULL,
    FOREIGN KEY (id) REFERENCES Veiculo(id)
);

-- Onibus herda de Veiculo
CREATE TABLE Onibus (
    id INT PRIMARY KEY,
    assentos INT NOT NULL,
    FOREIGN KEY (id) REFERENCES Veiculo(id)
);
