public class Message implements MessageInterface {
    private UserInterface sender;
    private UserInterface recipient;
    private String messageText;
    private MessageStatus status;

    public Message(UserInterface sender, UserInterface recipient, String messageText, MessageStatus status) {
        this.sender = sender;
        this.recipient = recipient;
        this.messageText = messageText;
        this.status = status;
    }

    @Override
    public UserInterface getSender() {
        return sender;
    }

    @Override
    public UserInterface getRecipient() {
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