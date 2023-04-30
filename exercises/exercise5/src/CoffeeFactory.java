// Factory Pattern
public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        switch (type) {
            case "latte":
                return new Latte();
            case "cappuccino":
                return new Cappuccino();
            case "espresso":
                return new Espresso();
            default:
                throw new IllegalArgumentException("Invalid coffee type: " + type);
        }
    }
}