package application.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="application.backend.persistence.repositories")
@EntityScan(basePackages = "application.backend.persistence.domain.backend")
@EnableTransactionManagement
public class ApplicationConfig {
	
}