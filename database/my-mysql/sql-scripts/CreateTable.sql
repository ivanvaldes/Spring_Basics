CREATE TABLE USER (
code INT(6) AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(30) NOT NULL,
password VARCHAR(50) NOT NULL
);

CREATE TABLE CLIENT (
code INT(6) AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
lastname VARCHAR(50) NOT NULL,
enamil VARCHAR(50) NOT NULL,
phone VARCHAR(20) NOT NULL
);

CREATE TABLE PRODUCT (
code INT(6) AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
type VARCHAR(250) NOT NULL
);


CREATE TABLE PRODUCT (
code INT(6) AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
description VARCHAR(250) NOT NULL,
category_code INT(6) NOT NULL,
image BLOB NOT NULL,
FOREIGN KEY (categor_code) REFERENCES category(code) ON DELETE CASCADE
);

CREATE TABLE ORDER (
code INT(6) AUTO_INCREMENT PRIMARY KEY,
amount INT(6) NOT NULL,
product_code INT(6) NOT NULL,
client_code INT(6) NOT NULL,
order_number INT(6) NOT NULL,
FOREIGN KEY (product_code) REFERENCES client(code) ON DELETE CASCADE,
FOREIGN KEY (client_code) REFERENCES product(code) ON DELETE CASCADE
);

