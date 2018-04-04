# Microservices with Spring Boot
A simple implementation of [Microservices](https://en.wikipedia.org/wiki/Microservices) using [Spring Boot](https://projects.spring.io/spring-boot/) 2, [Eureka](http://www.baeldung.com/spring-cloud-netflix-eureka) and [Ribbon](http://www.baeldung.com/spring-cloud-rest-client-with-netflix-ribbon).

## Start it up

### The easy way - Docker
1. Run 'gradle builddocker' from root project.
2. Run 'docker-compose up' from root/src/scripts/docker.
3. Wait a minute so all things is registered (I haven't got time to speed this up...yet).

Then [click here to get a random greeting to a random person](http://localhost:8080/hello). 

### The less easy way - manual
Start the applications (using 'gradle bootrun' from subdirectories or from your IDE) in the following order:
1. Eureka naming server
2. Who-service
3. What-service.
4. Hello

Then [click here to get a random greeting to a random person](http://localhost:8080/hello).

