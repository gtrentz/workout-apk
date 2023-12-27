package src.tests;
import src.classes.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testGetName() {
        User user = new User("John Doe", "johndoe", "password");
        assertEquals("John Doe", user.getName());
    }

    @Test
    void testSetName() {
        User user = new User("John Doe", "johndoe", "password");
        user.setName("Jane Doe");
        assertEquals("Jane Doe", user.getName());
    }

    @Test
    void testGetUser() {
        User user = new User("John Doe", "johndoe", "password");
        assertEquals("johndoe", user.getUser());
    }

    @Test
    void testAddFriend() {
        User user1 = new User("John Doe", "johndoe", "password");
        User user2 = new User("Jane Doe", "janedoe", "password");

        user1.addFriend(user2);

        assertTrue(user1.getFriends().contains(user2));
    }

    @Test
    void testToString() {
        User u = new User("Johnny Appleseed", "japple", "appletree");
        assertEquals(u.toString(), "Name: Johnny Appleseed\nUsername: japple\n->\n");
    }
}
