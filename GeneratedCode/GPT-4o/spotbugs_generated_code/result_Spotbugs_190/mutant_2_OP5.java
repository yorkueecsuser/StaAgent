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

        // Mutation: Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999:  // This case will never be reached because getUnreachableValue() never returns 999
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case does nothing
                break;
        }

        return ITEMS;
    }

    // A helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return -1;  // Always returns -1, making the switch case unreachable
    }

    public static void main(String[] args) {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        System.out.println("Modified ITEMS: " + bugDemo.showBug());
    }
}