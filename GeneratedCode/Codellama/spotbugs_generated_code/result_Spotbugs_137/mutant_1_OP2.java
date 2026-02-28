import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
    }
}

// Mutation Operator: Duplication
// Description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation.
// Core Requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST compile successfully.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutant 1: Duplicate the assignment statement "list.add("baz");" and insert it immediately after its current location.
List<String> list = new ArrayList<>();
list.add("foo");
list.add("bar");
list.add("baz");
list.add("baz"); // Mutant 1

System.out.println(list.contains(new Object())); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)