package application.utils;

import application.backend.persistence.domain.backend.User;

public class UsersUtils {

    /**
     * Non instantiable.
     */
    private UsersUtils() {
        throw new AssertionError("Non instantiable");
    }

    /**
     * Creates a user with basic attributes set.
     * @return A User entity
     */
    public static User createBasicUser(String userName, String email) {

        User user = new User();
        user.setUsername(userName);
        user.setPassword("secret");
//        user.setPassword("{noop}secret");
        user.setEmail(email);
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("123456789123");
        user.setCountry("GB");
        user.setEnabled(true);
        user.setDescription("A basic user");
        user.setProfileImageUrl("https://blabla.images.com/basicuser");

        return user;
    }
}
