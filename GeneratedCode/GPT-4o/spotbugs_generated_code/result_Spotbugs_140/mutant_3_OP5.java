import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        boolean result = setContainer.contains(setContainer); // This will return true because the set contains itself.
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 0:
                System.out.println("This will never be printed.");
                break;
            default:
                // This block is added to avoid unreachable statement error
                break;
        }
        
        return result;
    }

    public static int getUnreachableValue() {
        return 2; // Ensures the switch statement case 0 is never reached
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}