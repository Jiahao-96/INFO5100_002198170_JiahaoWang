import java.util.ArrayList;
import java.util.List;

public class Order {
    private String coffeeType;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.notifyOrderReady(this);
        }
    }
}