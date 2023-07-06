REM   Script: Session 02
REM   Activity 1 to 3

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

INSERT INTO salesman VALUES (5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES (5002, 'Nail Knite' , 'Paris', 13);

INSERT INTO salesman VALUES (5005, 'Pit Alex', 'London', 11);

INSERT INTO salesman VALUES (5006, 'McLyon', 'Paris', 14);

INSERT INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13);

INSERT INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12);

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

