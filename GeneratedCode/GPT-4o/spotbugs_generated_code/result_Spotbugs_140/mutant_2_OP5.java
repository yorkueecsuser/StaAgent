import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        boolean result = setContainer.contains(setContainer); // This will return true because the set contains itself.

        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            default:
                // Do nothing
                break;
        }
        
        return result;
    }

    // Method to ensure switch statement is unreachable
    private int getUnreachableValue() {
        return -1; // Value that does not match any case in the switch statement
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}