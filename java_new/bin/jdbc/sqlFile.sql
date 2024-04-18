-- 유저 생성 구문
create user 'java_User' @ 'localhost' indentified by 'mysql';

-- DB 생성
create database javadb;

-- 유저 권한 부여
grant all privileges on javadb. * to 'java_User' @ 'localhost' with grant option;
flush privileges;

-- 상품 등록
create table product(
pno int not null auto_increment,
pname varchar(50) not null,
price int not null default 0,
regdate datetime default now(),
madeby text,
primary key(pno));