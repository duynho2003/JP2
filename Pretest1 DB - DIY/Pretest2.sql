CREATE DATABASE Pretest
USE Pretest

CREATE TABLE tbProduct (
	ID int identity primary key,
	[NAME] varchar(50) not null,
	PRICE int check (PRICE between 1 and 1000),
	QOH int
)
INSERT INTO tbProduct ([NAME], PRICE, QOH) VALUES
('Laptop', 1000, 2),
('Mouse', 10, 5),
('Mouse OP', 14, 4),
('USB', 15, 5),
('Computer', 500, 1)
SELECT * FROM tbProduct