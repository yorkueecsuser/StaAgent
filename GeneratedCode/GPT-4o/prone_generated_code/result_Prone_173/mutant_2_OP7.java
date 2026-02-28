import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        }

        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
    
    // Helper method to ensure dynamic condition
    private boolean getCondition() {
        return false; // This can be dynamically determined in other scenarios
    }
}