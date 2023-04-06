CREATE DATABASE javaDB
USE javaDB
CREATE TABLE tbProject (
	id integer identity (100,1) primary key,
	projectName varchar(100),
	startDate varchar(10),
	[value] integer,
	completed bit
)
SELECT * FROM javaDB