import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        
        boolean conditionFor = getCondition(); // Using a method call to avoid compile-time constant
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This block will never execute due to the conditionFor being false at runtime
            System.out.println("This should never print.");
        }

        return setContainer.contains(setContainer); // This will return true because the set contains itself.
    }

    private boolean getCondition() {
        return false; // This simulates an always-false condition at runtime
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}