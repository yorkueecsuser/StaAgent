import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed because the condition is always false.");
        }
        return setContainer.contains(setContainer); // This will return true because the set contains itself.
    }
    
    private boolean getCondition() {
        return false; // Always return false to make the if block unreachable.
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}