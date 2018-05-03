package application.test.integration;

import application.backend.persistence.domain.backend.Role;
import application.backend.persistence.domain.backend.User;
import application.backend.persistence.domain.backend.UserRole;
import application.backend.services.UserService;
import application.enums.PlansEnum;
import application.enums.RolesEnum;
import application.utils.UsersUtils;
import org.junit.rules.TestName;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tedonema on 11/04/2016.
 */
public abstract class AbstractServiceIntegrationTest {
    @Autowired
    protected UserService userService;

    protected User createUser(TestName testName) {
        String username = testName.getMethodName();
        String email = testName.getMethodName() + "@devopsbuddy.com";

        Set<UserRole> userRoles = new HashSet<>();
        User basicUser = UsersUtils.createBasicUser(username, email);
        userRoles.add(new UserRole(basicUser, new Role(RolesEnum.BASIC)));

        return userService.createUser(basicUser, PlansEnum.BASIC, userRoles);
    }
}
