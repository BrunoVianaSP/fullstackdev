package application.test.integration;

//import application.FullstackdevApplication;
//import application.backend.persistence.domain.backend.Plan;
//import application.backend.persistence.domain.backend.Role;
//import application.backend.persistence.domain.backend.User;
//import application.backend.persistence.domain.backend.UserRole;
//import application.backend.persistence.repositories.PlanRepository;
//import application.backend.persistence.repositories.RoleRepository;
//import application.backend.persistence.repositories.UserRepository;
//import application.enums.PlansEnum;
//import application.enums.RolesEnum;
//import application.utils.UsersUtils;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.TestName;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.UUID;
//
///**
// * Created by tedonema on 29/03/2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = DevopsbuddyApplication.class)
public class UserRepositoryIntegrationTest extends AbstractIntegrationTest {



//    @Rule public TestName testName = new TestName();
//
//
//    @Before
//    public void init() {
//        Assert.assertNotNull(planRepository);
//        Assert.assertNotNull(roleRepository);
//        Assert.assertNotNull(userRepository);
//    }
//
//    @Test
//    public void testCreateNewPlan() throws Exception {
//        Plan basicPlan = createPlan(PlansEnum.BASIC);
//        planRepository.save(basicPlan);
//        Plan retrievedPlan = planRepository.findOne(PlansEnum.BASIC.getId());
//        Assert.assertNotNull(retrievedPlan);
//    }
//
//    @Test
//    public void testCreateNewRole() throws Exception {
//
//        Role userRole  = createRole(RolesEnum.BASIC);
//        roleRepository.save(userRole);
//
//        Role retrievedRole = roleRepository.findOne(RolesEnum.BASIC.getId());
//        Assert.assertNotNull(retrievedRole);
//    }
//
//    @Test
//    public void createNewUser() throws Exception {
//
//        String username = testName.getMethodName();
//        String email = testName.getMethodName() + "@devopsbuddy.com";
//
//        User basicUser = createUser(username, email);
//
//        User newlyCreatedUser = userRepository.findOne(basicUser.getId());
//        Assert.assertNotNull(newlyCreatedUser);
//        Assert.assertTrue(newlyCreatedUser.getId() != 0);
//        Assert.assertNotNull(newlyCreatedUser.getPlan());
//        Assert.assertNotNull(newlyCreatedUser.getPlan().getId());
//        Set<UserRole> newlyCreatedUserUserRoles = newlyCreatedUser.getUserRoles();
//        for (UserRole ur : newlyCreatedUserUserRoles) {
//            Assert.assertNotNull(ur.getRole());
//            Assert.assertNotNull(ur.getRole().getId());
//        }
//
//    }
//
//    @Test
//    public void testDeleteUser() throws Exception {
//
//        String username = testName.getMethodName();
//        String email = testName.getMethodName() + "@devopsbuddy.com";
//
//        User basicUser = createUser(username, email);
//        userRepository.delete(basicUser.getId());
//    }
//
//    @Test
//    public void testGetUserByEmail() throws Exception {
//        User user = createUser(testName);
//
//        User newlyFoundUser = userRepository.findByEmail(user.getEmail());
//        Assert.assertNotNull(newlyFoundUser);
//        Assert.assertNotNull(newlyFoundUser.getId());
//    }
//
//    @Test
//    public void testUpdateUserPassword() throws Exception {
//        User user = createUser(testName);
//        Assert.assertNotNull(user);
//        Assert.assertNotNull(user.getId());
//
//        String newPassword = UUID.randomUUID().toString();
//
//        userRepository.updateUserPassword(user.getId(), newPassword);
//
//        user = userRepository.findOne(user.getId());
//        Assert.assertEquals(newPassword, user.getPassword());
//
//    }

}
