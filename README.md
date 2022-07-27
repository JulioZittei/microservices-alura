<h1 align="center">Microservices Alura</h1>

<p align="center">
  <a href="#-technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-how-to-run">How to run</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-license">License</a>
</p>

<p align="center">
  <img alt="License" src="https://img.shields.io/static/v1?label=license&message=MIT&color=8257E5&labelColor=000000">
</p>

## ✨ Technologies

This project was developed with the following technologies:

- [SpringBoot](https://spring.io/projects/spring-boot)
- [Spring Framework](https://spring.io/projects/spring-framework)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring Cloud Netflix Eureka](https://spring.io/projects/spring-cloud-netflix)
- [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
- [Spring Cloud Config](https://spring.io/projects/spring-cloud-config)
- [Spring Cloud Sleuth](https://spring.io/projects/spring-cloud-config)
- [Papertrail](https://www.papertrail.com/)
- [MySQL](https://www.mysql.com/)

## 🚀 How to run

- Clone the repository;
- Import this project to your IDE
- Configure the database connection in the file `application.yml`

```
spring:
  datasource:
    username: 'user'
    password: 'password'
    url: jdbc:mysql://localhost:3306/alura?createDatabaseIfNotExist=true&serverTimezone=UTC

  jpa:
    hibernate:
      ddl-auto: create
    
```

- Start each microservice server with `Run as Java Application`

- The config-server can be accessed at [`localhost:8888`](http://localhost:8888/provider/default)
- The eureka-server can be accessed at [`localhost:8761`](http://localhost:8761/eureka/apps)
- The provider service can be accessed at [`localhost:8081`](http://localhost:8081/info/{state})
- The shop service can be accessed at [`localhost:8080`](http://localhost:8080/shop)

## 📄 License

This project is under the MIT license. See the [LICENSE](LICENSE) file for more details.

---

Made with ♥ by Julio Zittei 👋🏻
