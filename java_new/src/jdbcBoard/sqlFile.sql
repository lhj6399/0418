--유저 생성 구문
create user 'java_User' @ 'localhost' indentified by 'mysql';

--DB 생성
create database javadb;

--유저 권한 부여
grant all privileges on javadb. * to 'java_User' @ 'localhost' with grant option;
flush privileges;

--board 등록
create table board(
bno int not null auto_increment,
title varchar(50) not null,
writer varchar(30) not null,
content text,
regdate datetime default now(),
moddate datetime default now(), 
primary key(bno));