import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        // Adding the unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block of code is unreachable
            System.out.println("This line is unreachable");
        }

        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }

    // This method is added for the dynamic condition generation
    private boolean getCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}