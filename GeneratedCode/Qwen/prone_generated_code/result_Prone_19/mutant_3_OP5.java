import java.util.HashSet;
import java.util.Set;

class CollectionBugDemo {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(100L);
        boolean contains = values.contains(42); // BUG: CollectionIncompatibleType

        // Inserting an unreachable switch statement
        boolean switchCondition = getSwitchCondition();
        switch (switchCondition) {
            case true:
                System.out.println("This will never be printed because switchCondition is always false");
                break;
            default:
                // Default case to ensure switch is not empty and always reachable
                break;
        }

        return contains;
    }

    private boolean getSwitchCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42: " + demo.showBug());
    }
}