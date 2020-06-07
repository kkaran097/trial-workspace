alter table payments add orderNumber int(11);
truncate payments;
source insert_rows.sql;
alter table payments add constraint foreign key (orderNumber) references orders(orderNumber);