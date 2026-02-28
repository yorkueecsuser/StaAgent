import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        // BUG: CollectionIncompatibleType
        return values.contains(42); // This will return false due to incompatible types
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);

        // Mutation: Unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 999:
                System.out.println("This case is unreachable.");
                break;
            default:
                break;
        }
    }

    // Method to ensure the switch statement is dynamically determined at runtime
    public static int getUnreachableSwitchValue() {
        return 1000; // Ensures the switch statement is unreachable
    }
}