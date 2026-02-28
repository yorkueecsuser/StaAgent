import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] array = list.toArray(new String[0]); // BUG: CollectionToArraySafeParameter
        System.out.println(array);
    }
}

// Renamed variable "list" to "l"
// Renamed variable "array" to "a"

class CollectionToArraySafeParameterBug {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");

        String[] a = l.toArray(new String[0]); // BUG: CollectionToArraySafeParameter
        System.out.println(a);
    }
}