## **Configuration service**

Configuration service is a part of microservices application Online store.
It manages services configuration data that is read during the service bootstrapping phase.
Configuration of an application is separated from the actual code being deployed.

## **Building**

To compile source code and build Docker image:
```
mvn clean package docker:build
```

## **Running**

To start service in Docker container:
```
docker run marinasavchenko/onlinestore-configsrv:v1
```

## **Running the tests**

To run tests via Maven:
```
mvn clean test
```

## **Technology stack**

* Java
* Spring Boot
* Spring Cloud

* Maven
* Docker