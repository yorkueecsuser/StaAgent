import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)

        // Introducing unreachable if statement
        boolean condition = getCondition(); // this will always return false
        if (condition) {
            System.out.println("This code is unreachable.");
        }

        return setContainer.contains(setContainer); // This will return true because the set contains itself.
    }
    
    // Method to ensure the condition is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}