# Microservices with Spring Boot
A simple implementation of [Microservices](https://en.wikipedia.org/wiki/Microservices) using [Spring Boot](https://projects.spring.io/spring-boot/) 2, [Eureka](http://www.baeldung.com/spring-cloud-netflix-eureka) and [Ribbon](http://www.baeldung.com/spring-cloud-rest-client-with-netflix-ribbon).

## Start it up
Start the applications (using 'gradle bootrun' from subdirectories or from your IDE) in the following order:
1. Eureka naming server
2. Who-service
3. What-service.
4. Hello

Then [click here to get a random greeting to a random person](http://localhost:8080/hello).

## TODO's
* Introduce Docker Docker
    - Docker image for each application
    - Docker Compose to start them all  