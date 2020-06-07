with myOs as select O.orderNumber, O.shippedDate, C.customerName from customers C, orders O where C.customerNumber=O.customerNumber,
info as select myOs.customerName,O1.orderNumber, myOs.shippedDate,P.paymentDate,O1.quantityOrdered*O1.priceEach as amount,O1.quantityOrdered,O1.productCode from myOs,orderdetails O1,payments P where myOs.orderNumber=O1.orderNumber and myOs.orderNumber=P.orderNumber
select info.customerName,info.orderNumber,info.shippedDate,info.paymentDate,info.amount,info.quantityOrdered,P1.productName,P2.image from info join products P1 on info.productCode=P1.productCode join productlines P2 on P1.productLine=P2.productLine;


