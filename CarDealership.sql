CREATE TABLE EMPLOYEE (
EMP_NAME_FIRST VARCHAR2 (50),
EMP_NAME_LAST VARCHAR2 (50),
EMP_USER_NAME VARCHAR2 (50) PRIMARY KEY,
EMP_PASS_WORD VARCHAR2 (50));

CREATE TABLE CUSTOMER (
CUST_NAME_FIRST VARCHAR2 (50),
CUST_NAME_LAST VARCHAR2 (50),
CUST_USER_NAME VARCHAR2 (50) PRIMARY KEY,
CUST_PASS_WORD VARCHAR2 (50));

CREATE TABLE CAR (
CAR_ID NUMBER PRIMARY KEY,
CAR_MAKE VARCHAR2 (50),
CAR_MODEL VARCHAR2 (50),
CAR_COLOUR VARCHAR2 (50),
CAR_COST NUMBER);

CREATE SEQUENCE CARSEQ START WITH 1000;

CREATE TABLE CAR_PAYMENTS(
CUST_NAME_FIRST VARCHAR2 (50),
CUST_NAME_LAST VARCHAR2 (50),
CUST_USER_NAME VARCHAR2 (50),
CAR_ID NUMBER,
CAR_INITIAL_COST NUMBER,
MONTHLY_PAYMENT NUMBER,
MONTHS_REMAINING NUMBER,
CAR_REMAINING_BALANCE NUMBER,
PRIMARY KEY (CAR_ID, CUST_USER_NAME));

ALTER TABLE CAR_PAYMENTS
ADD CONSTRAINT FK_CAR_PAYMENTS_CAR
FOREIGN KEY (CAR_ID) REFERENCES CAR (CAR_ID);

ALTER TABLE CAR_PAYMENTS
ADD CONSTRAINT FK_CAR_PAYMENTS_CUSTOMER
FOREIGN KEY (CUST_USER_NAME) REFERENCES CUSTOMER(CUST_USER_NAME);

ALTER TABLE OFFER
ADD CONSTRAINT FK_OFFER_CUSTOMER
FOREIGN KEY (CUST_USER_NAME) REFERENCES CUSTOMER(CUST_USER_NAME);

ALTER TABLE OFFER
ADD CONSTRAINT FK_OFFER_CAR
FOREIGN KEY (CAR_ID) REFERENCES CAR(CAR_ID);

CREATE TABLE OFFER(
CUST_USER_NAME VARCHAR2 (50),
CAR_ID NUMBER,
CUST_BID NUMBER,
OFFER_PENDING VARCHAR2 (50))

CREATE OR REPLACE PROCEDURE OFFERPRO
(CUST_USER_NAME IN VARCHAR2, CAR_ID NUMBER, CUST_BID NUMBER, OFFER_PENDING VARCHAR2)
AS
BEGIN
INSERT INTO OFFER VALUES (CUST_USER_NAME, CAR_ID, CUST_BID, OFFER_PENDING);
COMMIT;
END;
/

DROP TABLE CAR_PAYMENTS;

CREATE TABLE OWNED_CARS(
CUST_USER_NAME VARCHAR2 (50),
CAR_ID NUMBER,
CAR_MAKE VARCHAR2 (50),
CAR_MODEL VARCHAR2 (50),
CAR_COLOUR VARCHAR2 (50),
MONTH_PAYMENTS_REMAINING NUMBER,
MONTHLY_PAYMENTS NUMBER,
PAYMENT_REMAINING NUMBER)

DELETE FROM OWNED_CARS WHERE (CAR_ID) = 1040;

CREATE OR REPLACE PROCEDURE PAYMENTPRO
(CUST_USER_NAME IN VARCHAR, CAR_ID NUMBER, MONTH_PAYMENTS_REMAING NUMBER, PAYMENT_REMAINING NUMBER
AS
BEGIN
UPDATE MONTH_PAYMENTS_REMAINING, PAYMENT_REMAINING WHERE (CUST_USER_NAME, CAR_ID);
COMMIT;
END;
/