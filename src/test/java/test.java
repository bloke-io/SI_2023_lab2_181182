import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {

    @Test
    public void testAllFieldsNull() {
        List<User> allUsers = new ArrayList<>();
        User user = new User(null, null, null)
        Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
    }

    @Test
    public void testPasswordNull() {
        List<User> allUsers = new ArrayList<>();
        User user = new User("username", null, "user@example.com");
        Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
    }

    @Test
    public void testEmailNull() {
        List<User> allUsers = new ArrayList<>();
        User user = new User("username", "password", null);
        Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
    }

    @Test
    public void testUsernameNull() {
        List<User> allUsers = new ArrayList<>();
        User user = new User(null, "password", "user@example.com");
        Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        Assertions.assertEquals("user@example.com", user.getUsername());
    }
}
