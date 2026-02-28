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

        // MUTATION INSERTION
        // Insert an unreachable switch statement
        int value = getValue();
        switch (value) {
            case 0:
                System.out.println("This case is unreachable");
                break;
            default:
                System.out.println("This case is also unreachable");
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}