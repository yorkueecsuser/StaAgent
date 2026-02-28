import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
    }
}