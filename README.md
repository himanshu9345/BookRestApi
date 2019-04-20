# BookRestApi

- REST web service that allows user to inventory books.                                                                                   
- Use Java Spring as the framework and mySQL as the database.
Functions                                                                                                                                  
- Add a book with attributes such as the barcode, title, author, number of pages, and whether or not User has read it.                     
- Delete a Book                                                                                                                             - Seach a Book

API Accepts and send data in JSON fomrat


How to run the porject?
-
- Go to Project folder
- Open BookRestApi-master\src\main\resources\application.properties file
- Chnage the MySQL Setting, Create a mysql database and replace {mydb} with newly created database name.
- Run mvn clean install
- Run mvn spring-boot:run to run the application
- Test the app on Postman

Get/Search a book 
GET operation
http://localhost:8080/api/v1/book/93832321312
last number string can be the barcode of book.
 
Add a Book
POST operation
http://localhost:8080/api/v1/book 
body: {"barcode":"93832321313","title":"Book1","author":"Himanshu Patel","pages":"230","read":"False"}
read :True if user has read the book else False

Delete a book
DELETE operation
http://localhost:8080/api/v1/book/93832321313 (barcode) 

