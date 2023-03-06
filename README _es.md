# MSC (Managing a school center)
[:uk:](README.md) 

## Descripción
La aplicación **MSC** permite la gestión de un centro escolar mediante los siguientes módulos:

## Tecnología
La aplicación **MSC** esta desarrollada en API REST donde cada módulo es un microservició independiente,
el proyecto esta desarrollado con las siguientes tecnologías:
- Base de datos:
  - PostgreSQL
- Contenedores
  - Docker(con Docker-compose V2)
- Backend:
  - Java 17
  - Spring Boot 3
  - Spring Data JPA
  - Lombok
  - Hibernate

## Ejecución de la aplicación
Para ejecutar la aplicación tendremos que bajarnos la aplicación y una vez la tengamos descargada utilizaremos
el siguiente comando
```
docker compose up -d
```

Cuando tengamos todos los servicios arrancados podremos acceder a los diversos endpoints de las apis mediante 
las siguientes urls: