import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // Using a method to ensure dynamic condition
        while (conditionWhile) {
            System.out.println("This is an unreachable statement.");
        }

        return setContainer.contains(setContainer); // This will return true because the set contains itself.
    }

    private boolean getCondition() {
        return false; // The condition is false, making the while loop unreachable.
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}