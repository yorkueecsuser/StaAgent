import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        // Unreachable if statement added
        if (false) {
            System.out.println("This code will never be executed");
        }

        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
    }
}