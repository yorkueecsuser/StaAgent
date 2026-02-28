import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        
        // Introduced unreachable switch statement
        int unreachableCondition = getDynamicValue(); // Use a method to ensure it's not a compile-time constant
        switch (unreachableCondition) {
            case 9999:
                System.out.println("This will never be printed.");
                break;
        }
        
        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
    
    // A method to provide a dynamic value, ensuring the switch statement is unreachable
    private int getDynamicValue() {
        return -1; // Always returns a value not matching the case in the switch
    }
}