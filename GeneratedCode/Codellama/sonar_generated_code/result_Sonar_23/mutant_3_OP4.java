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

        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}