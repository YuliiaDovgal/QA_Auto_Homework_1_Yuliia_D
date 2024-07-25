public interface MessageInterface {

    String getSender();

    String getRecipient();

    String getMessageText();

    MessageStatus getStatus();

    void setStatus(MessageStatus status);
}


