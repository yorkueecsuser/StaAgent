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

// MUTANT 1: Unreachable if statement
// Inserting unreachable if branch into a randomly selected basic block in the program.
// The condition of the inserted branch is always false to make it unreachable.

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
        if (false) {
            System.out.println(linkedList);
        } else {
            System.out.println("Unreachable branch");
        }
    }
}

// MUTANT 2: Unreachable while loop
// Inserting unreachable while loop into a randomly selected basic block in the program.
// The condition of the inserted loop is always false to make it unreachable.

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
        while (false) {
            System.out.println(linkedList);
        }
        System.out.println("Unreachable branch");
    }
}

// MUTANT 3: Unreachable for loop
// Inserting unreachable for loop into a randomly selected basic block in the program.
// The condition of the inserted loop is always false to make it unreachable.

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
        for (int i = 0; false; i++) {
            System.out.println(linkedList);
        }
        System.out.println("Unreachable branch");
    }
}

// MUTANT 4: Unreachable if-else statement
// Inserting unreachable if-else statement into a randomly selected basic block in the program.
// The condition of the inserted if-else statement is always false to make it unreachable.

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
        if (false) {
            System.out.println(linkedList);
        } else {
            System.out.println("Unreachable branch");
        }
    }
}

// MUTANT 5: Unreachable switch statement
// Inserting unreachable switch statement into a randomly selected basic block in the program.
// The condition of the inserted switch statement is always false to make it unreachable.

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
        switch (0) {
            case 1:
                System.out.println(linkedList);
                break;
            default:
                System.out.println("Unreachable branch");
                break;
        }
    }
}