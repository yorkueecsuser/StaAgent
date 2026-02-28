import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace

        // Unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 999: // This case will never be reached
                System.out.println("This will never be printed.");
                break;
            default:
                // Do nothing
                break;
        }

        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
    
    // Method to ensure dynamic evaluation of the switch statement 
    private int getUnreachableCondition() {
        return -1; // Ensure that this is not a value in the switch cases
    }
}