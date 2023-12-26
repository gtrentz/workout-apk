package src.classes;
import java.util.ArrayList;

/**
 * Creates a new user
 *
 * @author gtrentz
 * Created 12-25-2023
 */

public class User {
    private String name;
    private String username;
    private String password;
    private ArrayList<User> friends;

    /**
     * Simple constructor
     *
     * @param n First & last name
     * @param u Username
     * @param p Password - will hash for storage
     */
    public User(String n, String u, String p) {
        name = n; username = u; password = p;
    }

    /**
     * @return name User's name
     */
    public String getName() {return name;}

    public void setName(String n) {
        name = n;
    }

    /**
     * @return username Username
     */
    public String getUser() {return username;}

    public void setUser(String u) { //Idk if I want to implement this
        username = u;
    }

    /**
     * Adds a new friend
     *
     * @param u New friend
     */
    public void addFriend(User u) {
        friends.add(u);
    }

}
