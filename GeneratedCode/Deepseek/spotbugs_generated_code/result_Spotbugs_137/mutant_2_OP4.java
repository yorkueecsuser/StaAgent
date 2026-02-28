import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // Original bug remains

        // Unreachable if-else statement mutant
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block should never be executed due to the false condition
            System.out.println("Unreachable code");
        } else {
            // This block will always be executed
            // No changes to the original bug
        }

        return stringCollection.contains(str);
    }
}