import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        
        // Unreachable if-else branch
        boolean condition = getFalseCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Alternative code (always executed)
            System.out.println("This is always executed.");
        }
        
        return foos;
    }
    
    private boolean getFalseCondition() {
        return false;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}