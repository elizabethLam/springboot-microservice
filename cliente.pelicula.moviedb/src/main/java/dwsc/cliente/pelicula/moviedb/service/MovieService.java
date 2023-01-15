package dwsc.cliente.pelicula.moviedb.service;


import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dwsc.cliente.pelicula.moviedb.util.CustomResponse;


@Service
public class MovieService implements IMovieService {

	@Autowired
	RestTemplate restTemplate;

	public CustomResponse validarPelicula(String title) {
		CustomResponse res = new CustomResponse();
		res.setMessage("comprobar pelicula B");
	
		try {
			ResponseEntity<String> result = restTemplate.getForEntity(
					"https://api.themoviedb.org/3/search/movie?api_key=b832aaa83820a1367f25bb7ac5b072c9&query=" + title,
					String.class);

			
			JSONObject data = new JSONObject(result.getBody());
			res.setValidate(data.getInt("total_results") > 0);//check if the movie exist
			

		}  catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

}
