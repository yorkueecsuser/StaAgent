import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        // BUG: CollectionIncompatibleType
        boolean containsValue = values.contains(42); // This will return false due to incompatible types
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); 
        switch (unreachableValue) {
            case 1:
                System.out.println("This block is unreachable");
                break;
            default:
                System.out.println("Default case");
        }
        
        return containsValue;
    }
    
    private int getUnreachableValue() {
        return 42; // Ensure that this value does not match any case, making the switch statement unreachable
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}