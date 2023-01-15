package dwsc.cliente.pelicula.moviedb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import dwsc.cliente.pelicula.moviedb.service.IMovieService;
import dwsc.cliente.pelicula.moviedb.util.CustomResponse;


@RestController
public class MovieController {
	
	
	private IMovieService service;
	
	
	public MovieController(IMovieService service) {
		this.service = service;
	}
	
	
	@GetMapping("/")
	public CustomResponse validarPelicula(@RequestParam String title) {
		return service.validarPelicula(title);		
	}

}
