import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        // Added unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
            case 2:
                // This case is unreachable
                COLLECTION.add("UnreachableItem");
                break;
        }

        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }

    // Method to dynamically determine the condition for the switch statement
    private static boolean getCondition() {
        return false;
    }
}