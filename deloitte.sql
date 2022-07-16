CREATE TABLE student (
roll_no INT, 
student_name VARCHAR(40), 
marks INT,
CONSTRAINT pk_student PRIMARY KEY (roll_no));

SELECT * FROM student ORDER BY roll_no;

DROP TABLE student; 

INSERT INTO student (roll_no, student_name, marks) VALUES (101, 'Sonu', 98);
INSERT INTO student (roll_no, student_name, marks) VALUES (102, 'Monu', 96);
INSERT INTO student (roll_no, student_name, marks) VALUES (103, 'Tonu', 99);

