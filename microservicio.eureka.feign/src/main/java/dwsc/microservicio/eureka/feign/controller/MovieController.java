package dwsc.microservicio.eureka.feign.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dwsc.microservicio.eureka.feign.service.IMovieService;
import dwsc.microservicio.eureka.feign.util.Movie;


@RestController
public class MovieController {
	
	@Autowired
	private IMovieService service;

	
	@PostMapping("/movie")
	public String insertMovie(@RequestBody Movie movie) {
		return service.insertMovie(movie);	
	}
}
