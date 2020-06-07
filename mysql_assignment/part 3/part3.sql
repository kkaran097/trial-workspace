start transaction;
insert  into `customers`(`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`addressLine2`,`city`,`state`,`postalCode`,`country`,`salesRepEmployeeNumber`,`creditLimit`) values 
	(104,'Was Human','Bhoi','Selmon ','127.0.0.1','Bandar-West, Bombay',NULL,'Mumbai',NULL,'400075','India',1370,'2100000.00');

insert  into `orders`(`orderNumber`,`orderDate`,`requiredDate`,`shippedDate`,`status`,`comments`,`customerNumber`) values 
	(10427,'2007-01-06','2007-01-13','2007-01-10','Shipped',NULL,104);

insert  into `orderdetails`(`orderNumber`,`productCode`,`quantityOrdered`,`priceEach`,`orderLineNumber`) values
	(10427,'S18_1129',10,'120.31',2);

insert into `payments` (`customerNumber`,`checkNumber`,`paymentDate`,`amount`,`orderNumber`) values
	(104,'SK10678','2007-01-18','1203.1',10427);

commit;
