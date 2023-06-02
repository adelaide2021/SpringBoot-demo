# Java Web Application Demo using Spring Boot
This is a simple demo of a Java web application built with Spring Boot. The purpose of this application is to demonstrate the basic CRUD (Create, Read, Update, Delete) operations on a student record stored in a PostgreSQL database. The project follows a layered architecture consisting of the API layer, Service layer, Data Access layer, and the database.

### Set up and run the application:
``
cd target
java -jar demo-0.0.1-SNAPSHOT.jar
``

### API endpoints:
Create: Send a POST request to /api/students with the student data in the request body.
Get: Send a GET request to /api/students/{id} to retrieve a specific student by ID.
Update: Send a PUT request to /api/students/{id}?name="" with the updated student data in the parameters.
Delete a Student: Send a DELETE request to /api/students/{id} to delete a specific student by ID.

