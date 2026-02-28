import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)

        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable due to condition always being false
            System.out.println("This will never print.");
        } else {
            // Normal execution continues here
            return setContainer.contains(setContainer); // This will return true because the set contains itself.
        }
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}