package application.test.integration;

//import application.DevopsbuddyApplication;
//import application.backend.persistence.domain.backend.PasswordResetToken;
//import application.backend.persistence.domain.backend.User;
//import application.backend.service.PasswordResetTokenService;
//import application.backend.service.UserService;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.TestName;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * Created by tedonema on 10/04/2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = DevopsbuddyApplication.class)
public class PasswordResetTokenServiceIntegrationTest extends AbstractServiceIntegrationTest {

//    @Autowired
//    private PasswordResetTokenService passwordResetTokenService;
//
//    @Rule public TestName testName = new TestName();
//
//    @Test
//    public void testCreateNewTokenForUserEmail() throws Exception {
//
//        User user = createUser(testName);
//
//        PasswordResetToken passwordResetToken =
//                passwordResetTokenService.createPasswordResetTokenForEmail(user.getEmail());
//        Assert.assertNotNull(passwordResetToken);
//        Assert.assertNotNull(passwordResetToken.getToken());
//
//    }
//
//    @Test
//    public void testFindByToken() throws Exception {
//        User user = createUser(testName);
//
//        PasswordResetToken passwordResetToken =
//                passwordResetTokenService.createPasswordResetTokenForEmail(user.getEmail());
//        Assert.assertNotNull(passwordResetToken);
//        Assert.assertNotNull(passwordResetToken.getToken());
//
//        PasswordResetToken token = passwordResetTokenService.findByToken(passwordResetToken.getToken());
//        Assert.assertNotNull(token);
//
//    }

}
