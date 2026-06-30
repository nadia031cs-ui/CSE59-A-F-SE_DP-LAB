public interface MessageSender {

    void sendMessage(String message);
}
public class EmailSender implements MessageSender {
    @Override

    public void sendMessage(String message) {

        System.out.println("Sending email: " + message);

    }

}
 

public class SMSSender implements MessageSender {

 @Override

    public void sendMessage(String message) {

        System.out.println("Sending SMS: " + message);

    }

}

public class NotificationService {

 private MessageSender messageSender;
public NotificationService(MessageSender messageSender) {

        this.messageSender = messageSender;

    }
  public void alertUser(String msg) {

        messageSender.sendMessage(msg);

    }

}

public class Main {

    public static void main(String[] args) {

        MessageSender email = new EmailSender();

        NotificationService notification1 = new NotificationService(email);

        notification1.alertUser("Welcome!");

        MessageSender sms = new SMSSender();

        NotificationService notification2 = new NotificationService(sms);

        notification2.alertUser("OTP: 123456");

    }

}
