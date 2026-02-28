import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Mutant 1: Duplicate the assignment statement and insert immediately after its current location.
        list.add("foo");

        // Mutant 2: Duplicate the assignment statement and insert immediately after its current location.
        list.add("bar");

        // Mutant 3: Duplicate the assignment statement and insert immediately after its current location.
        list.add("baz");

        // Mutant 4: Duplicate the assignment statement and insert immediately after its current location.
        list.add("qux");

        // Mutant 5: Duplicate the assignment statement and insert immediately after its current location.
        list.add("quux");
    }
}