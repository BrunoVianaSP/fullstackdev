package application;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import application.backend.persistence.domain.backend.Role;
import application.backend.persistence.domain.backend.User;
import application.backend.persistence.domain.backend.UserRole;
import application.backend.services.UserService;
import application.enums.PlansEnum;
import application.enums.RolesEnum;
import application.utils.UsersUtils;

@SpringBootApplication
public class FullstackdevApplication implements CommandLineRunner {

	/** The application logger */
	private static final Logger LOG = LoggerFactory.getLogger(FullstackdevApplication.class);

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(FullstackdevApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String userName = "proUser"; 
		String email = "proUser@email.com";
		
		User user = UsersUtils.createBasicUser(userName, email);
		Set<UserRole> userRoles = new HashSet<>();
		userRoles.add(new UserRole(user, new Role(RolesEnum.BASIC)));
		LOG.debug("Creating user with username {}", user.getUsername());
		userService.createUser(user, PlansEnum.PRO, userRoles);
		LOG.info("User {} created", user.getUsername());
	}
}