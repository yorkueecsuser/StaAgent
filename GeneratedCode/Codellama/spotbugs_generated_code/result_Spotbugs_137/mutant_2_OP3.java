import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // MUTATION: Unreachable if statement
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable, so it will not be executed");
        }
    }
}