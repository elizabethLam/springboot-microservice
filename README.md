# springboot-microservice
Demo Spring Boot microservice with Eureka Server and Feign


Microservices: 

• microservice.eureka.server: Every Microservice will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. (Service Registration and Discovery)

• cliente.pelicula.omdb (version A): Use OMDb API to check if a specify movie exist.

• cliente.pelicula.moviedb (version B): Use The Movie DataBase API to check if a specify movie exist.

• microservicio.eureka.feign: Contains an operation to insert a movie into the database.Database insert is not implemented. Only checking the movie based on its title is implemented. The implementation of this
operation, in this initial version, returns a text string indicating whether the movie it can be inserted or not (it will be able to be inserted if the movie verification is successful). A
Use feign for load balancing.

