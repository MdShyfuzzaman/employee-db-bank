### Technology
 - JDK-8
 - Spring Boot 
 - Spring Batch
 - Spring JPA
 - MySQL
 - Maven 3.x

### MySQL setup
  - create db into mysql employee_info_bank
  - update db credential from application.properties

### build
  mvn clean

### run with maven command
   mvn spring-boot:run

### CURL
  curl -X POST http://localhost:8080/batch/start