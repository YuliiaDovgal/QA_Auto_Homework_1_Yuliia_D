import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final   Map<String, User> users = new HashMap<>();

    public static void addUser(User user) {
        users.put(user.getUserName(), user);
    }

    public static User getUser(String userName) {
        return users.get(userName);
    }

    public static void main(String[] args) {

        User nikita = new User("Nikita");
        User mateo = new User("Mateo");
        User daniel = new User("Daniel");


        Main.addUser(nikita);
        Main.addUser(mateo);
        Main.addUser(daniel);


        nikita.addContact(mateo);
        mateo.addContact(daniel);
        daniel.addContact(nikita);


        nikita.sendMessage("Hi Daniel, how's it going?", daniel);
        daniel.sendMessage("Hi Nikita. I'm doing well. ", nikita);
        nikita.sendMessage("What are your plans for the weekend?", daniel);
        daniel.sendMessage("I'm free this weekend.", nikita);
        nikita.sendMessage("How about we go sup boarding? There's a great lake near my place.", daniel);
        daniel.sendMessage("That's a great idea! Do you mind if I invite Mateo to join us?", nikita);
        nikita.sendMessage("No, I don't mind at all. We'll make a great team! We can even have a speed race.", daniel);
        daniel.sendMessage("Great! Where and when should we meet?", nikita);
        nikita.sendMessage("Let's meet on Saturday at 9 AM near my place.", daniel);
        daniel.sendMessage("Hi Mateo. How are you doing? Do you have any plans for the weekend? There's an idea to go sup boarding with Nikita. What do you think? Are you up for it?", mateo);
        mateo.sendMessage("Hi Daniel. Thanks, I'm doing well, and I’d love to join!", daniel);
        daniel.sendMessage("Great, we’ll meet on Saturday at 9 AM near Nikita’s place.", mateo);



        System.out.println("Messages for Nikita:");
        for (MessageInterface message : nikita.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }


        System.out.println("Messages for Daniel:");
        for (MessageInterface message : daniel.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }

        System.out.println("Messages for Mateo:");
        for (MessageInterface message : mateo.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }


        nikita.readMessage(0);
        nikita.readMessage(1);
        nikita.readMessage(2);
        nikita.readMessage(3);
        daniel.readMessage(0);
        daniel.readMessage(1);
        daniel.readMessage(2);
        daniel.readMessage(3);
        daniel.readMessage(4);
        daniel.readMessage(5);
        mateo.readMessage(0);
        mateo.readMessage(1);


        System.out.println("Messages for Nikita after reading:");
        for (MessageInterface message : nikita.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());

        }

        System.out.println("Messages for Daniel after reading:");
        for (MessageInterface message : daniel.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }

        System.out.println("Messages for Mateo after reading:");
        for (MessageInterface message : mateo.getMessages()) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }

    }
}