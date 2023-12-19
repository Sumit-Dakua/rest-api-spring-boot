# RestFull_API
This project is a simple Spring Boot application for a student API. It provides basic CRUD (Create, Read, Update, Delete) operations for managing student records.

## How to Run on a terminal (Linux)
To run the application, navigate to the project directory and use the following Maven command:

``` 
mvn spring-boot:run

```
The application will be started on port 8080.

## Technologies Used
- **Java**: Programming language used for development.
- **Spring Boot**: Framework for building Java-based enterprise applications.
- **Hibernate**: Object-relational mapping framework for managing database operations.
- **PostgreSQL**: Database used to store student records.

## Development Environment
- **Java**Version: 17.0.7
- **Maven**: Build and project management tool.
- **IDE**: Eclipse and NVIM are used for development.
- **Version** Control: GIT for source code version control.

## Project Structure
 The project follows the standard Maven project structure. Key components include:

- src/main/java/com/sd/studentapi/: Java source files for the application.
- src/main/resources/: Configuration files and static resources.
- pom.xml: Maven project configuration file.

## Database Configuration
The application is configured to use PostgreSQL as the database. You can modify the database connection details in the application.properties file in the src/main/resources/ directory.

```

spring.datasource.url=jdbc:postgresql://localhost:5432/student
spring.datasource.username= yourUser_name (example: sumit)
spring.datasource.password=yourPasswor
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
server.error.include-message=always

```

## Accessing the Application
Once the application is running, you can access it by opening a web browser and navigating to http://localhost:8080.

## API Endpoints

The API provides the following endpoints:

- **GET /students**: Get a list of all students.
- **GET /students/{id}**: Get details of a specific student.
- **POST /students**: Create a new student.
- **PUT /students/{id}**: Update details of a specific student.
- **DELETE /students/{id}**: Delete a specific student.

## Testing with Postman

You can test the API using [Postman](https://www.postman.com/):

1. Import the [Postman Collection](postman_collection.json) provided in this repository.
2. Use the imported collection to test different API endpoints.

## Stopping the Application

To stop the running application, press `Ctrl + C` in the terminal.


## Author
- Name: Sumit Dakua
- Email: [sumitdakua4@gmail.com]
- LinkedIn: [https://www.linkedin.com/in/sumit-dakua]
- Twitter : [https://twitter.com/sumitdakua1]
#### Feel free to reach out for any questions or collaboration opportunities!

##### Acknowledgments

This project was developed as part of the learning process and was inspired by the tutorials from Amigoscode YouTube channel.
