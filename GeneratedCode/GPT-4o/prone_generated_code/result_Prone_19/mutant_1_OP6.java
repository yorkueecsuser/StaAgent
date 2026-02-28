import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        // BUG: CollectionIncompatibleType
        boolean contains42 = values.contains(42); // This will return false due to incompatible types

        // Unreachable for loop
        boolean loopCondition = getCondition(); // Dynamically determine the condition at runtime
        for (int i = 0; loopCondition && i < 10; i++) {
            System.out.println("This is unreachable.");
        }
        
        return contains42;
    }

    // Method to simulate a condition for the unreachable for loop
    private boolean getCondition() {
        return false; // This ensures the loop is unreachable
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}