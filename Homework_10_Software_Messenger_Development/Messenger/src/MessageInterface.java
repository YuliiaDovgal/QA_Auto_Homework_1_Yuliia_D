public interface MessageInterface {

    UserInterface getSender();

    UserInterface getRecipient();

    String getMessageText();

    MessageStatus getStatus();

    void setStatus(MessageStatus status);
}


