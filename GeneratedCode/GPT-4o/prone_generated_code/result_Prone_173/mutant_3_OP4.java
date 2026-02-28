import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        
        // Mutation: Unreachable if-else statement
        boolean condition = false; // This is a non-final variable
        if (condition) {
            System.out.println("This is an unreachable if block.");
        } else {
            System.out.println("This else block is always executed.");
        }

        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}