package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="application.backend.persistence.repositories")
public class FullstackdevApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackdevApplication.class, args);
	}
}
