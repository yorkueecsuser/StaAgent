import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        // BUG: CollectionIncompatibleType
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            return values.contains(42); 
        } else {
            return values.contains(42); // Original code remains intact
        }
    }

    // Method that always returns false for the unreachable branch
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}