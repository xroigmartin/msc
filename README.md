# MSC (Managing a school center)
[:es:](README%20_es.md)

## Description
The **MSC** allows the management of a school center through the followings modules:

## Technology
The **MSC** application is developed in API REST, each module is an independent microservices,
the following techonologies are used in this project
- Data bases:
  - PostgreSQL
- Containers:
  - Docker(with Docker-compose V2)
- Backend:
  - Java 17
  - Spring Boot 3
  - Spring Data JPA
  - Lombok
  - Hibernate

## Execution on the application
for execute this application, first need download de repository and after execute this command:
```
docker compose up -d
```

When all services of compose are starting, we will be able to access the following endpoints: