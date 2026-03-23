package az.company.oop;

import java.util.List;

public class SmsNotification extends Notification{
    SmsNotification(){
        super("+994773108135");
    }
    @Override
    public void send(String recipient, String message){
        System.out.println("SMS -> " + recipient + ": " + message);
    }
    @Override
    void validate(String recipient){
        if(!recipient.startsWith("+"))
            throw new IllegalArgumentException("Invalid phone number!");
    }
}
