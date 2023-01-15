package dwsc.microservicio.eureka.feign.service;

import dwsc.microservicio.eureka.feign.util.Movie;

public interface IMovieService {
	
	public String insertMovie(Movie movie);

}
