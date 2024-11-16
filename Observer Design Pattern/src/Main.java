import Observable.StockManager;
import Observer.EmailNotification;
import Observer.SMSNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockManager store = new StockManager();

        EmailNotification email = new EmailNotification("abc@xyz.com");
        SMSNotification sms = new SMSNotification("02131234567");

        store.add(email);
        store.add(sms);

        store.addStock(2);

        store.remove(email);
        store.addStock(3);
    }
}