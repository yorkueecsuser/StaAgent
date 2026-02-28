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

        // Unreachable switch statement
        switch (false) {
            case 1:
                // This branch is unreachable
                System.out.println("This message will not be printed");
                break;
            default:
                // This branch is also unreachable
                System.out.println("This message will not be printed either");
                break;
        }
    }
}