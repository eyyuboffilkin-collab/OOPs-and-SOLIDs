package az.company.oop;

import java.util.List;

public class Main {
    static void main(String[] args) {
        Notification email = new EmailNotification();
        email.process("user@test.az", "Order confirmed");

        System.out.println("---");

        Notification sms = new SmsNotification();
        sms.process("+994773108135", "Order confirmed");

        System.out.println("---");

        List<Notification>channels = List.of(
                new EmailNotification(),
                new SmsNotification()
        );

        for(Notification n : channels){
            if(n instanceof EmailNotification){
                n.process("user@test.az", "Order confirmed");
            } else if(n instanceof SmsNotification){
                n.process("+994773108135", "Order confirmed");
            }
        }
        System.out.println("---");

        try{
            email.process("invalid-email", "Test" );
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            sms.process("invalid-number","Test");
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
