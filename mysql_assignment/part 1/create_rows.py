import mysql.connector as mcon
import datetime as dt
import numpy as np

np.random.seed(0)

user = "root"
password = ""
host = "127.0.0.1"
database = "classicmodels"
port = 3306 

cnx = mcon.connect(user=user, host=host, database=database, port=port)
cursor = cnx.cursor()

query = ("select O.orderNumber,O.status,O.customerNumber,O.shippedDate,sum(O1.quantityOrdered*O1.priceEach) as totalPayment "
"from orderdetails O1 join orders O on O1.orderNumber=O.orderNumber group by O.orderNumber;")

cursor.execute(query)

f=open("insert_rows.sql","a")
x="insert into payments (customerNumber,checkNumber,paymentDate,amount,orderNumber) values\n"

for (oN,st,cN,sD,tP) in cursor:
	if st!="Shipped":
		continue
	f.write(x)
	r=np.random.randint(26,size=2)
	checkNumber=chr(r[0]+65)+chr(r[1]+65)+str(np.random.randint(1000,999999))
	# date=dt.datetime.strptime(sD,"%Y-%m-%d")
	date=sD+dt.timedelta(days=np.random.randint(1,11))
	paymentDate=date.strftime('%Y-%m-%d')
	x="("+str(cN)+", '"+checkNumber+"', '"+paymentDate+"', '"+str(tP)+"', "+str(oN)+"),\n"

x=x[:-2]+";\n"
f.write(x)

cnx.close()
f.close()


