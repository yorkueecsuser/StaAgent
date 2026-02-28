import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Mutant code: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This line should not execute");
        }

        return stringCollection.contains(str);
    }

    private boolean getCondition() {
        return false;
    }
}