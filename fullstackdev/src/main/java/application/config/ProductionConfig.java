package application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import application.backend.services.EmailService;
import application.backend.services.SmtpEmailService;

 
@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/.fullstackdev/application-prod.properties")
public class ProductionConfig {

//    @Value("${stripe.prod.private.key}")
//    private String stripeProdKey;

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }

//    @Bean
//    public String stripeKey() {
//        return stripeProdKey;
//    }
}