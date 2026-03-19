CREATE DATABASE IF NOT EXISTS ecommerce;
USE ecommerce;

CREATE TABLE category (
    idCategory INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE product (
    idProduct INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    unit_price DECIMAL(10, 2) NOT NULL,
    quantity_stock INT DEFAULT 0,
    quantity_min INT NOT NULL,
    quantity_max INT NOT NULL,
    idCategory INT,
    FOREIGN KEY (idCategory) REFERENCES category(idCategory)
);

CREATE TABLE addresse (
	idAddresse INT AUTO_INCREMENT PRIMARY KEY,
    public_space VARCHAR(250) NOT NULL,
    cep VARCHAR(20) NOT NULL,
    city VARCHAR(100) NOT NULL,
    state VARCHAR(50) NOT NULL
);

CREATE TABLE user (
	idUser INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    cpf VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(30) NOT NULL,
    fone VARCHAR(20) NOT NULL,
    date_burth CHAR(10) NOT NULL,
    idAddresse INT,
	FOREIGN KEY (idAddresse) REFERENCES addresse(idAddresse)
);

CREATE TABLE card (
	idCard INT AUTO_INCREMENT PRIMARY KEY,
    card_number INT NOT NULL,
    validity CHAR(10) NOT NULL,
    cvv CHAR(3) NOT NULL,
    idUser INT,
    FOREIGN KEY (idUser) REFERENCES user(idUser)
);

CREATE TABLE paymentInfo (
	idPaymentInfo INT AUTO_INCREMENT PRIMARY KEY,
    tipe ENUM('card', 'pix', 'ticket') NOT NULL,
    discount INT,
    idUser INT,
    FOREIGN KEY (idUser) REFERENCES user(idUser)
);

CREATE TABLE cart (
	idCart INT AUTO_INCREMENT PRIMARY KEY,
    quantity INT,
    idProduct INT,
    idUser INT,
    FOREIGN KEY (idProduct) REFERENCES product(idProduct),
    FOREIGN KEY (idUser) REFERENCES user(idUser)
);

CREATE TABLE request (
	idRequest INT AUTO_INCREMENT PRIMARY KEY,
    value DECIMAL(50,10) NOT NULL,
    date DATETIME,
    discount INT,
    idCard INT,
    idPaymentInfo INT,
    FOREIGN KEY (idCard) REFERENCES card(idCard),
    FOREIGN KEY (idPaymentInfo) REFERENCES paymentInfo(idPaymentInfo)
);

CREATE TABLE userHistory (
	idUserHistory INT AUTO_INCREMENT PRIMARY KEY,
    idRequest INT,
    idUser INT,
    FOREIGN KEY (idRequest) REFERENCES request(idRequest),
    FOREIGN KEY (idUser) REFERENCES user(idUser)
);

CREATE TABLE ADM (
	idADM INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    cpf VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(30) NOT NULL,
    fone VARCHAR(20) NOT NULL
);
