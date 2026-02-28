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

    private boolean getFalseCondition() {
        return false;
    }

    public void unreachableIfStatement() {
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);

        // Call method to demonstrate insertion of unreachable code
        example.unreachableIfStatement();
    }
}