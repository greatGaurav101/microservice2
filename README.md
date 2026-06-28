# Microservice 2

A Spring Boot microservice demonstrating service-to-service communication in a microservices architecture using Spring Cloud Netflix Eureka and OpenFeign.

## Overview

**Microservice 2** (ms2) is a Spring Boot application that:
- Registers itself with a **Eureka Service Discovery** server
- Communicates with **Microservice 1** (ms1) via **OpenFeign** declarative HTTP client
- Exposes REST endpoints to other services

## Technology Stack

- **Java 17**
- **Spring Boot 4.0.1**
- **Spring Cloud 2025.1.0**
  - Netflix Eureka Client (service discovery)
  - OpenFeign (declarative HTTP client)
- **Maven** (build tool)

## Project Structure

```
src/main/
├── java/com/ms2/
│   ├── Microservice2Application.java    # Spring Boot entry point
│   ├── client/
│   │   └── Clientfromms2.java          # Feign client for calling ms1
│   └── controller/
│       └── microserviceController2.java # REST endpoint controller
└── resources/
    └── application.properties           # Configuration
```

## Configuration

The application is configured to run on port **8082** with the service name **microservice2**.

**File:** `src/main/resources/application.properties`
```properties
spring.application.name=microservice2
server.port=8082
```

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.6+

### Build & Run

```bash
# Using Maven wrapper
./mvnw clean install
./mvnw spring-boot:run

# OR using system Maven
mvn clean install
mvn spring-boot:run
```

The application will start on `http://localhost:8082`

## API Endpoints

### GET `/ms2`
Calls Microservice 1 and returns its response.

**Example:**
```bash
curl http://localhost:8082/ms2
```

## Architecture

```
Client Request
    ↓
[Microservice 2] (/ms2)
    ↓
[Feign Client - Clientfromms2]
    ↓
[Eureka Service Discovery] (lookup ms1)
    ↓
[Microservice 1] (/message)
```

## Dependencies

- **spring-boot-starter-webmvc** - Web MVC framework
- **spring-cloud-starter-netflix-eureka-client** - Eureka service discovery
- **spring-cloud-starter-openfeign** - Feign declarative HTTP client
- **spring-boot-devtools** - Development tools
- **spring-boot-starter-webmvc-test** - Testing utilities

## Branches

- **branch1** (default) - Main development branch

## License

This is a demo project for learning Spring Boot and microservices architecture.

---

For more information, visit the [GitHub repository](https://github.com/greatGaurav101/microservice2).
