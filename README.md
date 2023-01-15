# springboot-microservice
Demo Spring Boot microservice with Eureka Server and Feign


# Project Description

• microservice.eureka.server: Every Microservice will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. (Service Registration and Discovery)

• cliente.pelicula.omdb (version A): Use OMDb API to check if a specify movie exist.

• cliente.pelicula.moviedb (version B): Use The Movie DataBase API to check if a specify movie exist.

• microservicio.eureka.feign: Contains an operation to insert a movie into the database.Database insert is not implemented. Only checking the movie based on its title is implemented. The implementation of this
operation, in this initial version, returns a text string indicating whether the movie it can be inserted or not (it will be able to be inserted if the movie verification is successful).Use feign for load balancing.

# How to Install and Run the Project

Java (JDK 11 +)
Eclipse, IntelliJ IDEA, or another IDE.
Clone the projects and open/import this projects in the IDE.
Run euerka server, and then run the other microservices.
Euerka Sever will run in the port 8761.
You can use Postman to test the endpoint, ex: make a post request to  http://localhost:50606/movie, in the body add the title of the movie. 


