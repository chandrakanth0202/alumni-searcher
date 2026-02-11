#  Alumni LinkedIn Profile Searcher – Spring Boot Backend

##  Project Overview

This is a Spring Boot REST API application that allows searching and storing alumni details based on:

- University
- Designation
- Passout Year

The application saves alumni data into a MySQL database and provides endpoints to retrieve stored data.

---

##  Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Maven
- Lombok

---

##  Project Structure

com.assignment.alumni_searcher
│
├── controller
├── service
│ └── impl
├── repository
├── entity
├── dto
├── exception
└── AlumniSearcherApplication.java

# git clone <your-repo-url](https://github.com/chandrakanth0202/alumni-searcher>


OR download ZIP and extract.

---

### 2️⃣ Create MySQL Database

Open MySQL and run:

## sql
CREATE DATABASE alumni_db;

# Configure Database Connection

## Update src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/alumni_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8081


# Run the Application

From project root:

mvn spring-boot:run


OR (Windows)

.\mvnw.cmd spring-boot:run

# API Endpoints
## Search Alumni (POST)

URL

http://localhost:8081/api/alumni/search


Request Body

{
  "university": "ABC University",
  "designation": "Software Engineer",
  "passoutYear": 2022
}


Response

{
  "status": "success",
  "data": [
    {
      "name": "John Doe",
      "currentRole": "Software Engineer",
      "university": "ABC University",
      "location": "New York",
      "linkedinHeadline": "Passionate Engineer",
      "passoutYear": 2022
    }
  ]
}

##  Get All Alumni (GET)

URL

http://localhost:8081/api/alumni/all


