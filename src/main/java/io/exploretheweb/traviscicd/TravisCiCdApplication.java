package io.exploretheweb.traviscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TravisCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravisCiCdApplication.class, args);
	}

	@GetMapping("/")
	public String getAppStatus() {
		return "Travis CI/CD App is in running status";
	}
}
