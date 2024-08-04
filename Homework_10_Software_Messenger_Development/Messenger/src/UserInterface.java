import java.util.List;

public interface UserInterface {

        String getUserName();

        List<UserInterface> getContacts();

        List<MessageInterface> getMessages();

    void addContact(UserInterface contact);

    void sendMessage(String message, UserInterface recipient);

    void receiveMessage(MessageInterface message);
}

