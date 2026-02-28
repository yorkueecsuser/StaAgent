import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Mutated code: Unreachable if statement
        if (getUnreachableCondition()) {
            // This code is unreachable as getUnreachableCondition() always returns false
            System.out.println("This line is unreachable.");
        }

        return stringCollection.contains(str);
    }
}