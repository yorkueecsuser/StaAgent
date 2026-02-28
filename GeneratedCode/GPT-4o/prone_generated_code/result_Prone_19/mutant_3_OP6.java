import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);

        // Unreachable for loop mutation
        boolean shouldLoop = getLoopCondition();
        for (int i = 0; shouldLoop; i++) {
            System.out.println("This will never be printed.");
        }
        
        // BUG: CollectionIncompatibleType
        return values.contains(42); // This will return false due to incompatible types
    }
    
    // Method to provide a runtime condition for the for loop
    private boolean getLoopCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}