import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, User> users = new HashMap<>();

    public static void addUser(User user) {
        users.put(user.getUserName(), user);
    }

    public static User getUser(String userName) {
        return users.get(userName);
    }

    public static void main(String[] args) {

        User nik = new User("Nikita");
        User met = new User("Mateo");
        User den = new User("Daniel");


        Main.addUser(nik);
        Main.addUser(met);
        Main.addUser(den);


        nik.addContact("Mateo");
        met.addContact("Daniel");
        den.addContact("Nikita");


        nik.sendMessage("Hello, Mateo!", "Mateo");
        met.sendMessage("Hi, Daniel! How are you?", "Daniel");
        den.sendMessage("Good morning, Nikita!", "Nikita");


        System.out.println("Messages for Nikita:");
        for (MessageInterface message : nik.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }

        System.out.println("Messages for Mateo:");
        for (MessageInterface message : met.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }

        System.out.println("Messages for Daniel:");
        for (MessageInterface message : den.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }


        nik.readMessage(0); // Reading the first message


        System.out.println("Messages for Nikita after reading:");
        for (MessageInterface message : nik.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }
    }
}