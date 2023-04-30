package Method3;

import java.util.Comparator;
import java.util.List;

public class ListUtils {
    public static <T> T findMaxElement(List<T> list, int begin, int end, Comparator<T> comparator) {
        if (begin < 0 || end > list.size() || begin >= end) {
            throw new IllegalArgumentException("Invalid range");
        }

        T maxElement = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T currentElement = list.get(i);
            if (comparator.compare(currentElement, maxElement) > 0) {
                maxElement = currentElement;
            }
        }
        return maxElement;
    }
}
