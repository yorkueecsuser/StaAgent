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
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
        }
        
        // External code can modify the ITEMS list because it is public and mutable
        ITEMS.add("MaliciousItem");
        return ITEMS;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        System.out.println("Modified ITEMS: " + bugDemo.showBug());
    }
}