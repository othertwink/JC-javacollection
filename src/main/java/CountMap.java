import java.util.HashMap;
import java.util.Map;

public class CountMap {
    public <T> Map<T, Integer> countElements(T[] array) {

        Map<T, Integer> em = new HashMap<>();

        for (T element : array) {
            em.put(element, em.getOrDefault(element, 0) + 1);
        }

        return em;
    }
}
