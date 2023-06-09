CREATE DATABASE eWallet;

CREATE TABLE userTable
(id SERIAL PRIMARY KEY,
 name varchar(25) NOT NULL
);

CREATE TABLE wallet
( walletId SERIAL PRIMARY KEY ,
  userId int not null  ,
  balance int not null ,
  FOREIGN KEY (userId) REFERENCES userTable(id)
);

CREATE TABLE transaction
(
    rrn SERIAL PRIMARY KEY ,
    walletId int not null ,
    userId int not null ,
    amount int not null ,
    type_transaction varchar(20) not null ,
    status varchar(20) not null ,
    FOREIGN KEY (walletId) REFERENCES wallet(walletId),
    FOREIGN KEY (userId) REFERENCES userTable(id)
);