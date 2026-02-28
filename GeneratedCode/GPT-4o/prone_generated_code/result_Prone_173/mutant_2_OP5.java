import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        // Introducing an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // Default case can be used to ensure no unreachable statement error
                break;
        }
        return sort(foos);
    }

    // Method to ensure runtime evaluation for switch condition
    private int getUnreachableCondition() {
        return 2; // This value ensures that the switch statement is unreachable
    }
}