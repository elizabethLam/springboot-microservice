package dwsc.microservicio.eureka.feign.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dwsc.microservicio.eureka.feign.util.CustomResponse;

@FeignClient("COMPROBAR-PELICULA")
public interface MovieClient {
	
	
	@GetMapping("/")
	public CustomResponse validarPelicula(@RequestParam String title);

}
