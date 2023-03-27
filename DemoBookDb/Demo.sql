CREATE TABLE books (
	id integer identity primary key,
	title nvarchar(250),
	price integer
)
INSERT INTO books (title, price) VALUES ('Book 1', 10)
SELECT * FROM books