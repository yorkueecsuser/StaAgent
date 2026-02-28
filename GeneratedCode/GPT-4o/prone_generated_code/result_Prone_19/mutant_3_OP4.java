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

    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false; // condition is false, making the if-else branch unreachable
    }

    public void demonstrateUnreachableIfElse() {
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            System.out.println("This will never print due to the condition being false.");
        } else {
            System.out.println("This else branch is always executed.");
        }
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
        
        // Demonstrate the unreachable if-else branch
        example.demonstrateUnreachableIfElse();
    }
}