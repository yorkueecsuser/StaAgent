import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Mutated code: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop is unreachable."); // This loop is inserted to make the code mutated, but it will never execute.
        }

        return stringCollection.contains(str);
    }

    // A helper method to return false (making the unreachable loop condition always false)
    private boolean getCondition() {
        return false;
    }
}