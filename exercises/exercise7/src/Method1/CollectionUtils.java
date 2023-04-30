package Method1;

import java.util.Collection;
import java.util.function.Predicate;

public class CollectionUtils {
    public static <T> int countElements(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }
}
