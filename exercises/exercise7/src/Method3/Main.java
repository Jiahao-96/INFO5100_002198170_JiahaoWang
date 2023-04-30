package Method3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        System.out.println(ListUtils.findMaxElement(numbers,0,4, Comparator.comparingInt(Integer::intValue)));
    }
}