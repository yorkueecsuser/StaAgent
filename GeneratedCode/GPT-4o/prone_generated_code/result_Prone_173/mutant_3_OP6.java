import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        
        // Unreachable for loop added as a mutant
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }
        
        return foos;
    }

    private boolean getConditionForLoop() {
        return false; // This will make the loop condition false at runtime
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}