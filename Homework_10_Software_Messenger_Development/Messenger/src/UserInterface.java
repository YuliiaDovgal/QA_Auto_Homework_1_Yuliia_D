import java.util.List;

public interface UserInterface {

        String getUserName();

        List<String> getContacts();

        List<MessageInterface> getMessages();

    void addContact(String contact);

    void sendMessage(String message, String recipient);

    void receiveMessage(MessageInterface message);
}

