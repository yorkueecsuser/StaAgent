import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        boolean shouldAddItem = getCondition();
        if (shouldAddItem) {
            COLLECTION.add("Item3"); // This line demonstrates the bug
        } else {
            // Unreachable code due to the false condition
            System.out.println("This line should never be executed");
        }
        System.out.println(COLLECTION);
    }

    private boolean getCondition() {
        return false; // Always returning false to make the if-else branch unreachable
    }
}