CREATE TABLE IF NOT EXISTS Todo(id IDENTITY PRIMARY KEY, done BOOLEAN, text VARCHAR);
DELETE FROM Todo;
INSERT INTO Todo VALUES(1, true, 'Todo1');
INSERT INTO Todo VALUES(2, false, 'Todo2');