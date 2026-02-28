import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // No default case needed for this unreachable switch
                break;
        }

        return setContainer.contains(setContainer); // This will return true because the set contains itself.
    }

    // Method to simulate a dynamic runtime value for switch
    private int getUnreachableValue() {
        return 0; // This ensures the switch will never reach case 1
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}