import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Mutated code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This is the actual branch
            return stringCollection.contains(str);
        }
    }

    // Helper method to avoid compile-time constant in if condition
    private boolean getCondition() {
        return false;
    }
}