package dwsc.microservicio.eureka.feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import dwsc.microservicio.eureka.feign.dao.MovieClient;
import dwsc.microservicio.eureka.feign.exception.CustomNotFoundException;
import dwsc.microservicio.eureka.feign.util.CustomResponse;
import dwsc.microservicio.eureka.feign.util.Movie;

@Service
public class MovieService implements IMovieService {

	@Autowired
	private MovieClient movieClient;

	public String insertMovie(Movie movie) {
		CustomResponse res = null;
		String result = null;
		try {
			res = movieClient.validarPelicula(movie.getTitle());
			if (res.isValidate()) {
				result = "Se permite insertar." + "Microservicio " + res.getMessage();
	
			} else {
				result = "No se permite insertar." + "Microservicio " + res.getMessage();
			}
		} catch (feign.FeignException.ServiceUnavailable feignExc) {
			throw new CustomNotFoundException(HttpStatus.NOT_FOUND,
					"No se ha encontrado el microservicio Comprobar-pelicula");
		
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

}
