import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();


        User nikita = new User("Nikita");
        User mateo = new User("Mateo");
        User daniel = new User("Daniel");

        users.put(nikita.getUserName(), nikita);
        users.put(mateo.getUserName(), mateo);
        users.put(daniel.getUserName(), daniel);


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


        for (User user : users.values()) {
            user.readMessagesByStatus(MessageStatus.RECEIVED);
        }

        for (User user : users.values()) {
            user.printAllMessages();
        }
    }
}



