CREATE TABLE `orderscount` (
  `customerNumber` int(11) NOT NULL,
  `numberOfOrders` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`customerNumber`),
  KEY `customerNumber` (`customerNumber`),
  CONSTRAINT FOREIGN KEY (`customerNumber`) REFERENCES `customers` (`customerNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

 insert into orderscount (customerNumber,numberOfOrders) 
  select customerNumber,count(orderNumber) from orders group by customerNumber;

delimiter $$

create trigger inc_count before insert on orders 
  for each row begin 
  if NEW.customerNumber not in (select customerNumber from orderscount) then 
  insert into orderscount(`customerNumber`,`numberOfOrders`) values (NEW.customerNumber,1); 
  else update orderscount set numberOfOrders=numberOfOrders+1 where NEW.customerNumber=orderscount.customerNumber;
  end if;
  end$$

delimiter ;
