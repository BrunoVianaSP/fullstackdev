package application.config;

//import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import application.backend.services.EmailService;
import application.backend.services.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.fullstackdev/application-dev.properties")
public class DevelopmentConfig {

//	@Value("${stripe.test.private.key}")
//	private String stripeDevKey;

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

	// @Bean
	// public ServletRegistrationBean h2ConsoleServletRegistration() {
	// ServletRegistrationBean bean = new ServletRegistrationBean(new
	// WebServlet());
	// bean.addUrlMappings("/console/*");
	// return bean;
	// }

//	@Bean
//	public String stripeKey() {
//		return stripeDevKey;
//	}
}
