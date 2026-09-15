show databases;
create database gameStore;
use gameStore;
create table client (id int unsigned not null auto_increment, name varchar(20) not null, balance int not null, createdAdd date not null, primary key(id));
insert into client (name, balance, createdAdd) value ('Alex',100, '2026-05-24' ), ('Marta', 120, '2026-01-21'), ('Tom', 80, '2025-12-04');
insert into client (name, balance, createdAdd) value ('Anna', 60, '2025-03-20'), ('Jerry', 110, '2025-06-13'), ('Devid', 200, '2024-03-30');

-- Add additional enum column
alter table client add column type_client enum('ACTIVE', 'BLOCKED', 'PENDING') NOT NULL;
alter table client add column password varchar(20) not null;
alter table client add column password varchar(20) not null;
select * from client;
update client set password = 'alex1' where id = 1;
update client set password = 'marta1111' where id = 2;
update client set password = 'tom22' where id = 3;
update client set password = 'anna' where id = 4;
update client set password = 'j12' where id = 5;
update client set password = 'devid' where id = 6;
update client set password = 'kris' where id = 7;
