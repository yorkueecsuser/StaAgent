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

// Mutant 1: Duplicate the assignment statement and insert immediately after its current location
List<String> list = new ArrayList<>();
list.add("Hello");
list.add("World");

LinkedList<String> linkedList = (LinkedList<String>) list;

// Output the contents of the linked list
System.out.println(linkedList);

List<String> list = new ArrayList<>();
list.add("Hello");
list.add("World");

LinkedList<String> linkedList = (LinkedList<String>) list;

// Output the contents of the linked list
System.out.println(linkedList);