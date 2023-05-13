## What
Read data from text file and store into database

### Tools
 - JDK-8
 - MySQL 5.x
 - Maven 3.x

### Technology
 - Spring Boot 
 - Spring Batch
 - Spring JPA

### MySQL setup
  - create db into mysql employee_info_bank
  - update db credential from application.properties

### build
  mvn clean install

### run with maven command
   mvn spring-boot:run

### CURL
  curl -X POST http://localhost:8080/batch/start
