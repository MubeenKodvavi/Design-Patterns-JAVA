package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockManager implements Observable {
    private int stock = 0;
    private final List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer) {
        //TODO Implement this method
        observers.add(observer);
    }

    public void remove(Observer observer) {
        //TODO Implement this method
        observers.remove(observer);
    }

    public void notifyObservers() {
        //TODO Implement this method
        for (Observer observer : observers) {
            observer.update(this.stock);
        }
    }

    public void addStock(int stockCount) {
        //TODO Implement this method
        this.stock += stockCount;
        notifyObservers();
    }

    public int getStock() {
        return stock;
    }
}
