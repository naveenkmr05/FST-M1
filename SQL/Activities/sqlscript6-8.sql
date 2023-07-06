REM   Script: Session 05
REM   Activity 6,7 & 8

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

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int primary key, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

INSERT INTO salesman VALUES (5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES (5002, 'Nail Knite' , 'Paris', 13);

INSERT INTO salesman VALUES (5005, 'Pit Alex', 'London', 11);

INSERT INTO salesman VALUES (5006, 'McLyon', 'Paris', 14);

INSERT INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13);

INSERT INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12);

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int primary key, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

INSERT INTO salesman VALUES (5001, 'James Hoog', 'New York', 15);

INSERT ALL 
    INTO salesman VALUES (5002, 'Nail Knite' , 'Paris', 13);

	INTO salesman VALUES (5005, 'Pit Alex', 'London', 11);  


	INTO salesman VALUES (5006, 'McLyon', 'Paris', 14);  


	INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13);  


	INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12); 


SELECT 1 FROM dual;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int primary key, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

INSERT INTO salesman VALUES (5001, 'James Hoog', 'New York', 15);

INSERT ALL 
    INTO salesman VALUES (5002, 'Nail Knite' , 'Paris', 13);

	INTO salesman VALUES (5005, 'Pit Alex', 'London', 11);  


	INTO salesman VALUES (5006, 'McLyon', 'Paris', 14);  


	INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13);  


	INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12); 


SELECT * FROM dual;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int primary key, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

INSERT INTO salesman VALUES (5001, 'James Hoog', 'New York', 15);

INSERT ALL 
    INTO salesman VALUES (5002, 'Nail Knite' , 'Paris', 13) 
	INTO salesman VALUES (5005, 'Pit Alex', 'London', 11) 
	INTO salesman VALUES (5006, 'McLyon', 'Paris', 14) 
	INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13) 
	INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12) 
 
SELECT * FROM dual;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT * FROM salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT * FROM orders;

SELECT 1 FROM dual;

SELECT * FROM salesman;

SELECT * FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders ORDER BY ASC;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders ORDER BY salesman_id;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders ORDER BY order_date;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT COUNT(purchase_amount) FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(salesman_id) FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT DISTINCT COUNT(salesman_id) FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT DISTINCT salesman_id FROM orders COUNT(salesman_id) salesman;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT DISTINCT salesman_id FROM orders COUNT(salesman_id);

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;

SELECT purchase_amount FROM orders WHERE DATE '17-AUG-12';

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;

SELECT purchase_amount FROM orders WHERE order_date LIKE '17-AUG-12';

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;

SELECT purchase_amount, salesman_id FROM orders WHERE order_date LIKE '17-AUG-12';

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;

SELECT Max(purchase_amount), salesman_id FROM orders WHERE order_date LIKE '17-AUG-12';

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;

SELECT Max(purchase_amount, salesman_id) FROM orders WHERE order_date LIKE '17-AUG-12';

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;

SELECT Max(purchase_amount) FROM orders WHERE order_date LIKE '17-AUG-12';

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;

SELECT Max(purchase_amount),salesman_id FROM orders WHERE order_date LIKE '17-AUG-12';

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT Max(purchase_amount) FROM orders;

SELECT Min(purchase_amount) FROM orders;

SELECT COUNT(DISTINCT salesman_id) FROM orders;

