import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {

    // A mutable collection instance is assigned to a final static field
    public static final List<String> ITEMS = new ArrayList<>(); // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)

    static {
        ITEMS.add("Item1");
        ITEMS.add("Item2");
        ITEMS.add("Item3");
    }

    // Method to demonstrate the bug
    public List<String> showBug() {
        // Unreachable while loop mutant
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This will never print");
        }
        
        // External code can modify the ITEMS list because it is public and mutable
        ITEMS.add("MaliciousItem");
        return ITEMS;
    }

    // A method to simulate a condition for the unreachable code
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        System.out.println("Modified ITEMS: " + bugDemo.showBug());
    }
}