import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // Mutation: Unreachable if-else statement
        if (false) {
            // The following line of code should be unreachable
            list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.
        } else {
            // Added for mutation
            System.out.println("Unreachable code");
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}