import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace

        // Inserting an unreachable if statement
        boolean isAlwaysFalse = alwaysFalseCondition();
        if (isAlwaysFalse) {
            System.out.println("This branch is unreachable.");
        }

        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }

    // Method to simulate a condition that is always false
    private boolean alwaysFalseCondition() {
        return false;
    }
}