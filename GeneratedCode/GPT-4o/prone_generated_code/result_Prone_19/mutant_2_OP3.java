import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        // Unreachable if statement mutation
        boolean condition = getFalseCondition(); // This method call ensures the condition is false at runtime
        if (condition) {
            System.out.println("This code is unreachable");
        }

        // BUG: CollectionIncompatibleType
        return values.contains(42); // This will return false due to incompatible types
    }

    private boolean getFalseCondition() {
        return false; // This method returns false, making the if condition always false at runtime
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}