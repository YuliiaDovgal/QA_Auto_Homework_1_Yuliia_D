import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class User implements UserInterface {
    String userName;
    Set<UserInterface> contacts;
    List<MessageInterface> messages;

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
    public List<UserInterface> getContacts() {
        return new ArrayList<>(contacts);
    }

    @Override
    public List<MessageInterface> getMessages() {
        return new ArrayList<>(messages);
    }

    @Override
    public void addContact(UserInterface contact) {
        contacts.add(contact);
    }

    @Override
    public void sendMessage(String messageText, UserInterface recipient) {
        Message message = new Message(this, recipient, messageText, MessageStatus.SENT);
        recipient.receiveMessage(message);
    }

    @Override
    public void receiveMessage(MessageInterface message) {
        messages.add(message);
        message.setStatus(MessageStatus.RECEIVED);
    }

    public void readMessagesByStatus(MessageStatus status) {
        for (MessageInterface message : messages) {
            if (message.getStatus() == status) {
                message.setStatus(MessageStatus.READ);
            }
        }
    }

    public void readLatestUnreadMessage() {
        for (MessageInterface message : messages) {
            if (message.getStatus() == MessageStatus.RECEIVED) {
                message.setStatus(MessageStatus.READ);
                System.out.println("Read message:" + message.getMessageText());
                return;
            }
        }
    }

    public void removeContact(UserInterface contact) {
        contacts.remove(contact);
    }

    public void deleteMessage(MessageInterface message) {
        messages.remove(message);
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

    public void printAllMessages() {
        System.out.println("Messages for" + userName + ":");
        for (MessageInterface message : messages) {
            System.out.println(message.getMessageText() + " - " + message.getStatus());
        }
    }
}
