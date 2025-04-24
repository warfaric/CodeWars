package ArraysAndStrings;
import java.util.*;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)));
    }
    public static List<Object> filterList(final List<Object> list) {
        List<Object> filteredList = new ArrayList<>(list);
        filteredList.removeIf(obj -> obj instanceof String);
        return filteredList;
    }
}

