import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        boolean condition = getCondition(); // Non-final variable to prevent unreachable code
        if (condition) {
            System.out.println("This will never print");
        }
        return foos;
    }
    
    private boolean getCondition() {
        return false; // Simulates an always-false condition, but dynamically determined
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}