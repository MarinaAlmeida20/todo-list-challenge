<h1 align="center">
  TODO List
</h1>

API for managing tasks (CRUD) that is part of [this challenge](https://github.com/simplify-liferay/desafio-junior-backend-simplify) for junior backend developers applying.


## Technologies

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [PostgreSQL](https://www.postgresql.org/download/)

## Practices Adopted

- SOLID, DRY, YAGNI, KISS principles
- REST API
- Queries using Spring Data JPA
- Dependency Injection
- Error response handling
- Automatic Swagger generation with OpenAPI 3

## How to Execute

- Clone the repository
- Build the project:
```
$ ./mvnw clean package
```
- Execute the application:
```
$ java -jar target/challengetodolist-0.0.1-SNAPSHOT.jar
```

The API can be accessed at [localhost:8082](http://localhost:8082).
The Swagger UI can be viewed at [localhost:8082/swagger-ui.html](http://localhost:8082/swagger-ui.html)

## API Endpoints

[//]: # (The [httpie]&#40;https://httpie.io&#41; tool was used to make the HTTP requests below:)

The [postman](https://www.postman.com/) tool was used to make the HTTP requests below:

- Create Task

<p align="center">
    <img align="center" src="https://github.com/MarinaAlmeida20/todo-list-challenge/blob/dev/src/main/resources/assets/postman_post.png?raw=true" alt="postman post request"/>
</p>

- List Tasks

<p align="center">
    <img align="center" src="https://github.com/MarinaAlmeida20/todo-list-challenge/blob/master/src/main/resources/assets/postman_get.png?raw=true" alt="postman get request"/>
</p>

- Update Task

<p align="center">
    <img align="center" src="https://github.com/MarinaAlmeida20/todo-list-challenge/blob/dev/src/main/resources/assets/postman_put.png?raw=true" alt="postman put request"/>
</p>

- Delete Task

<p align="center">
    <img align="center" src="https://github.com/MarinaAlmeida20/todo-list-challenge/blob/dev/src/main/resources/assets/postman_delete.png?raw=true" alt="postman delete request"/>
</p>