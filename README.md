# Credit Card Management API Implementation

This application implements use case for buying and managing credit cards using Camunda, Java and Spring boot.

#Installation

##Pre-requisites

- JDK 11
- Apache Maven

##Build 
- From the main directory run these commands
- Build the artifacts and download all the dependencies run `mvn clean install`
- To run test cases `mvn test`

##Run the application

- run spring boot application command `mvn spring-boot:run`

##Access the application

- Also for API documentation use the below swagger link
http://localhost:8080/swagger-ui.html#/
- Application runs http://localhost:8080/

##Getting Started

The implementation consists of two microservices implemented in Java using Spring Boot as modules:
- `credit-card-process` : Micro-service for process the credit card request. Below API are included.
  - `RegisterProduct` : Used for registering a new product for the customer.
  - `CreateCard` : Used for requesting a new card for the customer.
  - This service runs on http://localhost:9090/ 
- `credit-card-service` : Micro-service for listing credit card types and requesting new credit card.
    - `GetCreditCardTypes` - This api shows the list of available credit card products (Eg. BRONZE, GOLD, PLATINUM).
    - `RequestCreditCard` - This api captures the user request for selected credit card product.
    - This service runs on http://localhost:8080/

- The process of fulfilling credit card request is handled through Camunda BPMN. The orchestration layer is using BPMN which
  calls these APIs sequentially.
- The process of fulfilling credit card request includes calling two APIs: `RegisterProduct` and `CreateCard`.

#Author
    Sudha Iyer
