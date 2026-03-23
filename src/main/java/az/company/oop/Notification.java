package az.company.oop;

abstract class Notification implements NotificationSender {
    private String sender; //encapsulation

    Notification(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public final void process(String recipient, String message) {
        validate(recipient);
        send(recipient, message);
        log(recipient, message);
    }

    private void log(String recipient, String message) {
        System.out.println("Log: " + recipient + " -> " + message);
    }

    abstract void validate(String recipient);
}
