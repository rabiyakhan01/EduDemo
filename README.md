# EduDemo
Spring boot application for the pricing strategy API covering basic use cases.

# Proposed API signature:
URL: localhost:8080/pricing/{courseID}/{userID}
  
Request: courseID (unsingned integer)
         
         userID (unsigned integer)
         
Response: 
Pricing Details
```
{
    "id": 2,
    "baseprice": 100,
    "taxes": 15,
    "other": 20,
    "location": "US",
    "course": {
        "id": 1,
        "coursename": "Python Getting Started",
        "pricingstrategy": "Free Courses”
  }
}
```

# Project Setup:
This application is a spring boot application developed using JPA and H2 database.

The database configurations can be found in application.properties file.

# Installation steps:
1. Clone the repository to a local directory
2. Cd into project directory 
3. Run “mvn clean install”
4. Run “java -jar target/demo-0.0.1-SNAPSHOT.jar”

This will generate the H2 database schema as also initialise it with the master data. 
The insert scripts can be found in src/resources/data.sql and the schema definition is located in /src/resources/schema.sql

# Accessing the H2 console:
H2 console can be accessed using http://localhost:8080/h2

Ensure that the connection URL is set to the following: “jdbc:h2:mem:testdb”

# Accessing the Swagger documentation:
http://localhost:8080/swagger-ui.html

# Use Cases covered

Different users from different locations, shall see different pricing information based on their location
*  http://localhost:8080/pricing/1/2
*  http://localhost:8080/pricing/1/1
  
Getting selective fields:
	Projections can be used for this scenario to return only the required fields from the repository [Spring IO!] (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#projections-excerpts)
(could not implement due to time constraint)

