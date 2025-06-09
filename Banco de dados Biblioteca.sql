create database biblioteca;

use biblioteca;

create table loginAdm (
matricula int not null auto_increment,
usuario varchar(20) not null unique,
senha varchar(20) not null,
primary key(matricula)
);

use biblioteca;

create table loginUser(
id int not null auto_increment,
email varchar(50) not null unique,
usuario varchar(50) not null,
senha varchar(20) not null,
primary key(id)
);

use biblioteca;

create table livros (
id int not null auto_increment,
titulo varchar(50) not null,
genero varchar(50) not null,
dataLancamento date not null,
autor varchar(50) not null,
primary key(id)
);

use biblioteca;
select * from livros;

use biblioteca;
select * from loginAdm;

use biblioteca;
select * from loginUser;