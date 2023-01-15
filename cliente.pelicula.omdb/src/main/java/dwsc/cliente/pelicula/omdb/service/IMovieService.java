package dwsc.cliente.pelicula.omdb.service;

import dwsc.cliente.pelicula.omdb.util.CustomResponse;

public interface IMovieService {
	 CustomResponse validarPelicula(String title);

}
