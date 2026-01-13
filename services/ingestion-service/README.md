# Ingestion Service (Spring Boot)

This service is part of the `fraud-detection-realtime` training project.

## Quickstart (Local)

### Prerequisites
- Docker + Docker Compose
- Java 17+
  
### Run dependencies
```bash
docker compose up -d

./mvnw clean test

./mvnw spring-boot:run

http://localhost:8081/actuator/health

http://localhost:8081/swagger-ui.html
