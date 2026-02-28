import java.util.HashSet;
import java.util.Set;

class CollectionBugDemo {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(100L);
        
        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
        }

        boolean contains = values.contains(42); // BUG: CollectionIncompatibleType
        return contains;
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // This ensures the condition is always false at runtime
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42: " + demo.showBug());
    }
}