import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable
            COLLECTION.remove("Item1");
        }
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }
}