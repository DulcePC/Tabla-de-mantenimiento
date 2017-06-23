create database conexion;
use conexion;

create table clientes(
 nom_cli varchar(30) not null,
 ape_cli varchar(30) not null,
 cod_cli int(5) not null auto_increment primary key,
 comb_cli bit not null
) 
go

 create table usuarios(
 
 nom_cli varchar(30) not null,
 ape_cli varchar(30) not null,
 cod_cli int(5) not null auto_increment primary key,
 comb_cli bit not null
 
 )
 
 select * from clientes
 select * from usuarios