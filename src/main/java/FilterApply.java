import java.util.Arrays;

interface Filter {
    Object apply(Object o);
}

public class FilterApply {
    public static <T> T[] filter(T[] array, Filter filter) {
        T[] filtered = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            filtered[i] = (T) filter.apply(filtered[i]);
        }
        return filtered;
    }
}
