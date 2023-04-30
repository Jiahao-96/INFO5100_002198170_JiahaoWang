package Method1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Count the number of odd integers in the list
        int count = CollectionUtils.countElements(numbers, n -> n % 2 != 0);
        System.out.println(count); // Output: 3

        // Count the number of palindromes in the list of strings
        List<String> words = new ArrayList<>();
        words.add("racecar");
        words.add("hello");
        words.add("level");
        count = CollectionUtils.countElements(words, s -> new StringBuilder(s).reverse().toString().equals(s));
        System.out.println(count); // Output: 2
    }
}
