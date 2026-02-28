import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    static List<String> COLLECTION = new ArrayList<>();

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        // Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This branch will never be executed because condition is always false
            System.out.println("This is an unreachable branch.");
        } else {
            COLLECTION.add("Item3"); // This line demonstrates the bug
            System.out.println(COLLECTION);
        }
    }

    // Dummy method to return false for the condition
    private boolean getCondition() {
        return false;
    }
}