public class Message implements MessageInterface {
    private final String sender;
    private final String recipient;
    private final String messageText;
    private MessageStatus status;

    public Message(String sender, String recipient, String messageText, MessageStatus status) {
        this.sender = sender;
        this.recipient = recipient;
        this.messageText = messageText;
        this.status = status;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getMessageText() {
        return messageText;
    }

    @Override
    public MessageStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(MessageStatus status) {
        this.status = status;
    }
}