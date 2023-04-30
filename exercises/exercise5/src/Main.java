public class Main {
    public static void main(String[] args) {
        // Singleton pattern
        OrderManagementSystem orderManagementSystem = OrderManagementSystem.getInstance();

        // Factory pattern
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee latte = coffeeFactory.createCoffee("latte");
        Coffee cappuccino = coffeeFactory.createCoffee("cappuccino");
        Coffee espresso = coffeeFactory.createCoffee("espresso");

        // Observer pattern
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Order order1 = new Order("latte");
        Order order2 = new Order("cappuccino");
        order1.addObserver(customer1);
        order1.addObserver(customer2);
        order2.addObserver(customer2);

        // Simulate order processing and notification
        orderManagementSystem.receiveOrder(order1);
        orderManagementSystem.prepareOrder(order1);
        order1.notifyObservers();
        orderManagementSystem.receiveOrder(order2);
        orderManagementSystem.prepareOrder(order2);
        order2.notifyObservers();
    }
}