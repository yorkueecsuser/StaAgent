import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Mutated code: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This line will never be executed.");
        }

        return stringCollection.contains(str);
    }

    private boolean getFalseCondition() {
        return false;
    }
}