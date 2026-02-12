Sugarfit Service Template
Overview :-

This project is a production-ready Spring Boot starter template designed to serve as the foundation for future backend microservices.

The goal of this assignment was not complexity of business logic, but quality of engineering, architecture, and operational readiness.

Tech Stack :-
1. Java 17

2. Spring Boot

3. Maven

4. Docker

5. Spring Actuator

controller/  -> REST layer  
service/     -> Business logic layer  
dto/         -> Request & response models  
exception/   -> Centralized exception handling  
config/      -> Filters and configurations  


How To Run Locally :-

1. Build -> ./mvnw clean package
2. Run -> ./mvnw spring-boot:run

Application runs at -> http://localhost:8080

Endpoints :-
1. Health Check
GET /health

Response:

{
"status": "UP"
}

2. Example Endpoint
POST /example

Request:

{
"userId": "123",
"value": 42
}

Response:

{
"status": "SUCCESS",
"requestId": "uuid"
}