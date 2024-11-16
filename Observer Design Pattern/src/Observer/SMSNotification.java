package Observer;

public class SMSNotification implements Observer {
    private final String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void update(int stock) {
        System.out.printf("Stock updated: %d. SMS sent to %s\n", stock, phoneNumber );
    }
}
