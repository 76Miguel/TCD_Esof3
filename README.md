-- Script do banco de dados

-- 1. Cria a tabela Usuario
CREATE TABLE Usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    senha VARCHAR(100),
    tipoPerfil VARCHAR(50)
);

-- 2. Cria a tabela Equipamento
CREATE TABLE Equipamento (
    id SERIAL PRIMARY KEY,
    tipo VARCHAR(50),
    marca VARCHAR(50),
    modelo VARCHAR(50),
    estadoAparente VARCHAR(100),
    statusAtual VARCHAR(50)
);

-- 3. Cria a tabela Triagem
CREATE TABLE Triagem (
    id SERIAL PRIMARY KEY,
    dataTeste DATE,
    laudoTecnico VARCHAR(255),
    componentesSubstituidos VARCHAR(255),
    equipamento_id INT REFERENCES Equipamento(id)
);

-- 4. Cria a tabela Destinacao
CREATE TABLE Destinacao (
    id SERIAL PRIMARY KEY,
    dataEnvio DATE,
    tipoDestino VARCHAR(50),
    entidadeRecebedora VARCHAR(100),
    termoDocumento VARCHAR(255),
    equipamento_id INT REFERENCES Equipamento(id)
);

-- 5. Insere o Técnico para o Login funcionar
INSERT INTO Usuario (nome, email, senha, tipoPerfil) 
VALUES ('Técnico EcoReverse', 'tecnico@ecoreverse.com', '123456', 'Técnico');
