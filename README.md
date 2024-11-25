# Tours Application

## Description
This is a Spring Boot application for managing tours, built with Kotlin and using PostgreSQL as the database.

## Technologies
- Kotlin 1.9.22
- Spring Boot 3.2.3
- Spring Data JPA
- PostgreSQL
- Gradle

## Prerequisites
- JDK 21
- PostgreSQL

## Setup and Installation
1. Clone the repository
2. Navigate to the project directory
3. Set up your PostgreSQL database and update the `application.properties` file with your database credentials

4. Build the project
5. Run the application



## Configuration
The main configuration for the application can be found in `src/main/resources/application.properties`. Make sure to update the following properties with your own database credentials:



## Configuration
The main configuration for the application can be found in `src/main/resources/application.properties`. Make sure to update the following properties with your own database credentials:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/toursdb
spring.datasource.username=your_username
spring.datasource.password=your_password

tours/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── com/
│   │   │       └── yourcompany/
│   │   │           └── tours/
│   │   │               ├── controllers/
│   │   │               ├── models/
│   │   │               ├── repositories/
│   │   │               └── services/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── kotlin/
│           └── com/
│               └── yourcompany/
│                   └── tours/
├── build.gradle.kts
└── README.md