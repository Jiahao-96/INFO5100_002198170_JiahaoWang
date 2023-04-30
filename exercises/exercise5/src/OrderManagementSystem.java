// Singleton Pattern
public class OrderManagementSystem {
    private static OrderManagementSystem instance = null;

    private OrderManagementSystem() {
        // Private constructor to prevent creation of new instances
    }

    public static OrderManagementSystem getInstance() {
        if (instance == null) {
            instance = new OrderManagementSystem();
        }
        return instance;
    }

    public void receiveOrder(Order order) {
        // Code to receive order and add it to the queue
    }

    public void prepareOrder(Order order) {
        // Code to prepare order and mark it as ready for pickup
    }
}