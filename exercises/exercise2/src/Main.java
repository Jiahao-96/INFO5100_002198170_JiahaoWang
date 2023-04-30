public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Triangle("red", 3, 4, 5);
        shapes[1] = new Rectangle("blue", 2, 5);
        shapes[2] = new Circle("green", 2.5);
        shapes[3] = new Square("yellow", 4);

        for (Shape shape : shapes) {
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("-----------------------");
        }
    }
}