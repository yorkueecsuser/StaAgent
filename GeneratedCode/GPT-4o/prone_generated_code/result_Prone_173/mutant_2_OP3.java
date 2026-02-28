import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        
        // Mutation: Insert an unreachable if statement
        boolean unreachableCondition = determineUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
        
        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }

    // Helper method to return a constant false value
    private boolean determineUnreachableCondition() {
        return false;
    }
}