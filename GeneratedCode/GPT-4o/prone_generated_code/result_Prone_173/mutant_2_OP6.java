import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        // Unreachable for loop added below
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
        }
        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
    
    // Helper method for unreachable loop condition
    private boolean getCondition() {
        return false; // The condition is always false dynamically
    }
}