import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Added unreachable if statement based on the mutation operator information
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code due to the condition being false
            System.out.println("This line should never execute.");
        }

        return stringCollection.contains(str);
    }

    // Method to simulate the condition for unreachable if statement, always returning false
    private boolean getCondition() {
        return false;
    }
}