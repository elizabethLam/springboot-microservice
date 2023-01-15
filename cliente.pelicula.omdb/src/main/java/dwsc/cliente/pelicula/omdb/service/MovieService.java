package dwsc.cliente.pelicula.omdb.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dwsc.cliente.pelicula.omdb.util.CustomResponse;

@Service
public class MovieService implements IMovieService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public CustomResponse validarPelicula(String title) {
		CustomResponse res = new CustomResponse();
		res.setMessage("comprobar pelicula A");	
		try {
			ResponseEntity<String> result = restTemplate
					.getForEntity("http://www.omdbapi.com/?t=" + title + "&apiKey=bf1d31e7", String.class);

			JSONObject data = new JSONObject(result.getBody());
			res.setValidate(data.getBoolean("Response"));
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
