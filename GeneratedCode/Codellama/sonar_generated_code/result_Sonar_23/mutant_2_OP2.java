// BUG: Cast operations should not trigger a ClassCastException

import java.util.*;

class BuggyCast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: This cast will throw a ClassCastException at runtime
        // because the actual type of the list is ArrayList<String>
        // and it cannot be cast to LinkedList<String>.
        LinkedList<String> linkedList = (LinkedList<String>) list;

        // Output the contents of the linked list
        System.out.println(linkedList);
    }
}

// Mutation Operator: Duplication
// Description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
// Core Requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST compile successfully.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutated Code:
class BuggyCast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: This cast will throw a ClassCastException at runtime
        // because the actual type of the list is ArrayList<String>
        // and it cannot be cast to LinkedList<String>.
        LinkedList<String> linkedList = (LinkedList<String>) list;

        // Output the contents of the linked list
        System.out.println(linkedList);

        // Mutated Code: Duplicated assignment statement
        LinkedList<String> linkedList2 = (LinkedList<String>) list;
    }
}