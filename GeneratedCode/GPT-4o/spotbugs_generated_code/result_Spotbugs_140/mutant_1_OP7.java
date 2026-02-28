import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)

        // Introduce an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is an unreachable while loop.");
        }

        return setContainer.contains(setContainer); // This will return true because the set contains itself.
    }

    // Method to provide a false condition for the loop
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}