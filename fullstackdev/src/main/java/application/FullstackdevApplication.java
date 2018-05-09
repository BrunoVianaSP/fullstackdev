package application;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import application.backend.persistence.domain.backend.Role;
import application.backend.persistence.domain.backend.User;
import application.backend.persistence.domain.backend.UserRole;
import application.backend.services.UserService;
import application.enums.PlansEnum;
import application.enums.RolesEnum;
import application.utils.UserUtils;

@SpringBootApplication
public class FullstackdevApplication implements CommandLineRunner {

	/** The application logger */
	private static final Logger LOG = LoggerFactory.getLogger(FullstackdevApplication.class);

	@Autowired
	private UserService userService;

	@Value("${webmaster.username}")
	private String webmasterUsername;

	@Value("${webmaster.password}")
	private String webmasterPassword;

	@Value("${webmaster.email}")
	private String webmasterEmail;
	
	public static void main(String[] args) {
		SpringApplication.run(FullstackdevApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		String userName = "proUser"; 
//		String email = "proUser@email.com";
		
		User user = UserUtils.createBasicUser(webmasterUsername, webmasterPassword);
		user.setPassword(webmasterPassword);
		user.setEmail(webmasterEmail);
		Set<UserRole> userRoles = new HashSet<>();
		userRoles.add(new UserRole(user, new Role(RolesEnum.ADMIN)));
		LOG.debug("Creating user with username {}", user.getUsername());
		userService.createUser(user, PlansEnum.PRO, userRoles);
		LOG.info("User {} created", user.getUsername());
	}
}