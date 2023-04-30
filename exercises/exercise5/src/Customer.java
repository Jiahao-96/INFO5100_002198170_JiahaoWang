public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void notifyOrderReady(Order order) {
        System.out.println("Customer " + name + ", your " + order.getCoffeeType() + " is ready for pickup!");
    }
}
