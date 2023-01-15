package dwsc.cliente.pelicula.omdb.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dwsc.cliente.pelicula.omdb.service.IMovieService;
import dwsc.cliente.pelicula.omdb.util.CustomResponse;


@RestController
public class MovieController {
	
	@Autowired
	private IMovieService service;
	
	
	@GetMapping("/")
	public CustomResponse validarPelicula(@RequestParam String title) {
		return service.validarPelicula(title);		
	}


}
