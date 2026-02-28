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

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);

        // Introduce unreachable while loop
        boolean conditionWhile = example.getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed.");
        }
    }
}