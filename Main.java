import src.classes.User;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Grant Trentz", "gtrentz", "soccer69");
        User u2 = new User("Harry Truong", "htruong", "anime");
        u1.addFriend(u2);
        for (User u : u1.getFriends()) {
            System.out.println(u);
        }
    }
}
