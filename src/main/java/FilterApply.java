import java.util.Arrays;

interface Filter {
    Object apply(Object o);
}

 class FilterImpl implements Filter {

    @Override
    public Object apply(Object o) {
        return null;
    }
}

public class FilterApply {
    public static <T> T[] filter(T[] array, FilterImpl filter) {
        T[] filtered = Arrays.copyOf(array, array.length);
        for (T element : filtered) {
            filter.apply(element);
        }
        return filtered;
    }
}
