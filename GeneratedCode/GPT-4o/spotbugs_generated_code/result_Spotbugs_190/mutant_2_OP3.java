import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {

    // A mutable collection instance is assigned to a final static field
    public static final List<String> ITEMS = new ArrayList<>(); // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)

    static {
        ITEMS.add("Item1");
        ITEMS.add("Item2");
        ITEMS.add("Item3");
    }

    // Method to demonstrate the bug
    public List<String> showBug() {
        // External code can modify the ITEMS list because it is public and mutable
        ITEMS.add("MaliciousItem");
        
        // Unreachable if statement mutation
        boolean unreachableCondition = getUnreachableCondition(); // This method can be designed to always return false
        if (unreachableCondition) {
            System.out.println("This branch is unreachable and won't be executed.");
        }

        return ITEMS;
    }

    // Helper method to simulate a runtime condition
    private boolean getUnreachableCondition() {
        return false; // This ensures the condition is evaluated at runtime and is false
    }

    public static void main(String[] args) {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        System.out.println("Modified ITEMS: " + bugDemo.showBug());
    }
}