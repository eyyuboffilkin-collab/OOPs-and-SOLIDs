package az.company.oop;

public class EmailNotification extends Notification{
    EmailNotification(){
        super("system@app.azz");
    }
    @Override
    public void send(String recipient, String message){
        System.out.println("Email -> " + recipient + ": " + message);
    }

    @Override
    void validate(String recipient){
        if(!recipient.contains("@"))
            throw new IllegalArgumentException("Invalid email!");
    }
}
