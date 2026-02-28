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
    
    public boolean getCondition() {
        return false;
    }

    public void unreachableIfElse() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable branch
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
        
        example.unreachableIfElse();
    }
}