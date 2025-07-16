package learn.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieApplication {

	public static void main(String[] args) {
		EnvLoader.loadEnv();
		SpringApplication.run(MovieApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot() {
		return "Hello, Movie API!";
	}

}
