package Method2;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayUtils.swapElements(numbers, 1, 3);
        for (Integer number : numbers) {
            System.out.print(number + " "); // Output: 1 4 3 2 5
        }
    }
}
