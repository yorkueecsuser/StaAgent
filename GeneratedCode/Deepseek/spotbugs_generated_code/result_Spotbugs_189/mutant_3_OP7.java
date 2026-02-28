import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    static List<String> COLLECTION = new ArrayList<>();

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        // Insert unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
        }

        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }

    // Dummy method to avoid compile-time errors
    private boolean getCondition() {
        return false;
    }
}