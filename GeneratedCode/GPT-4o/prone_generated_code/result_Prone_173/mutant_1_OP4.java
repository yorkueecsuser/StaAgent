import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace

        // Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This else branch is also unreachable.");
        }

        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }

    // A method to provide the condition for the if statement, ensuring it compiles
    private boolean getCondition() {
        return false;
    }
}