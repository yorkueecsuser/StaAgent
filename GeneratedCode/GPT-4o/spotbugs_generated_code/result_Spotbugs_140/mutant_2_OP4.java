import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> setContainer = new HashSet<>();
        setContainer.add(setContainer); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)

        // Introducing a variable to make the if-else branch unreachable without compile error
        boolean condition = alwaysFalse();

        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This else block is also unreachable.");
        }

        return setContainer.contains(setContainer); // This will return true because the set contains itself.
    }

    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}