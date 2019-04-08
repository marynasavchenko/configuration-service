## **Configuration service**

Configuration service is a part of microservices application Online store. It manages services configuration information.

## **Building**

1. To compile source code and build Docker image:
```
mvn clean package docker:build
```

## **Running**

1. To start service in Docker container:
```
docker run marinasavchenko/onlinestore-configsrv:v1
```

## **Running the tests**

1.To run tests via Maven:
```
mvn clean test
```

## **Technology stack**

* Java
* Spring Boot
* Spring Cloud

* Maven
* Docker