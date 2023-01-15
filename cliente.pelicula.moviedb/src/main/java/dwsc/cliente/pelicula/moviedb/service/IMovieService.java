package dwsc.cliente.pelicula.moviedb.service;

import org.springframework.stereotype.Service;

import dwsc.cliente.pelicula.moviedb.util.CustomResponse;


public interface IMovieService {
	
	 CustomResponse validarPelicula(String title);

}
