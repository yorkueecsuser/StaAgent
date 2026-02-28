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
        // Unreachable for loop - mutation
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("Unreachable code inside for loop");
        }

        // External code can modify the ITEMS list because it is public and mutable
        ITEMS.add("MaliciousItem");
        return ITEMS;
    }

    // Method to provide a false condition for the unreachable loop
    private boolean getConditionFor() {
        return false; // This ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        System.out.println("Modified ITEMS: " + bugDemo.showBug());
    }
}