import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements UserInterface {
    private final String userName;
    private final Set<String> contacts;
    private final List<MessageInterface> messages;

    public User(String userName) {
        this.userName = userName;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public List<String> getContacts() {
        return new ArrayList<>(contacts);
    }

    @Override
    public List<MessageInterface> getMessages() {
        return new ArrayList<>(messages);
    }

    @Override
    public void addContact(String contact) {
        contacts.add(contact);
    }

    @Override
    public void sendMessage(String messageText, String recipient) {
        Message message = new Message(userName, recipient, messageText, MessageStatus.SENT);
        User recipientUser = Main.getUser(recipient);
        if (recipientUser != null) {
            recipientUser.receiveMessage(message);
        }
    }

    @Override
    public void receiveMessage(MessageInterface message) {
        messages.add(message);
        message.setStatus(MessageStatus.RECEIVED);
    }


    public void readMessage(int index) {
        if (index >= 0 && index < messages.size()) {
            MessageInterface message = messages.get(index);
            message.setStatus(MessageStatus.READ);
        }
    }


    public void removeContact(String contact) {
        contacts.remove(contact);
    }

    public void deleteMessage(int index) {
        if (index >= 0 && index < messages.size()) {
            messages.remove(index);
        }
    }

    public List<MessageInterface> getMessagesByStatus(MessageStatus status) {
        List<MessageInterface> result = new ArrayList<>();
        for (MessageInterface message : messages) {
            if (message.getStatus() == status) {
                result.add(message);
            }
        }
        return result;
    }
}
