package Observer;

public class EmailNotification implements Observer {
    private final String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    public void update(int stock) {
        System.out.printf("Stock updated: %d. email sent to %s\n",stock,  email);
    }
}
