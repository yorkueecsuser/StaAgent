import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace

        // Begin of added unreachable for loop
        boolean conditionFor = getFalseCondition(); // Method call simulating false condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop."); // Unreachable loop body
        }
        // End of added unreachable for loop

        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }

    // Helper method to simulate a false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }
}