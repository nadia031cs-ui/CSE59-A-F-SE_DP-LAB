interface MessageSender{
    void sendMessage(String message);
}
class EmailSender implements MessageSender{

    @Override
    public void sendMessage(String message){
        System.out.println("Sending email: "+message);
    }
}
class SMSSender implements MessageSender{
    @Override
    public void sendMessage(String message){
        System.out.println("Sending SMS: "+message);
    }
}
class NotificationService{
    private MessageSender messageSender;
    public NotificationService(MessageSender messageSender){
        this.messageSender=messageSender;
    }
    public void alterUser(String msg){
        messageSender.sendMessage(msg);
    }

}



public class Main3 {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        NotificationService emailNotification= new NotificationService(email);
        emailNotification.alterUser("Welcome to our service.");


        MessageSender sms= new SMSSender();
        NotificationService smsNotification = new NotificationService(sms);
        smsNotification.alterUser ("Your OTP is 123345");
    }
}
