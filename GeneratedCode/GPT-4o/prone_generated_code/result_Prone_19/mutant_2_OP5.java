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

    private int getSwitchCondition() {
        return 5; // Always returns a value that is not in the switch cases
    }

    public void unreachableSwitchStatement() {
        int value = getSwitchCondition();
        switch (value) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            // No break statements to ensure no unreachable statement errors
        }
        // Due to the value from getSwitchCondition() always being 5,
        // the cases in the switch block above will never be executed.
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
        
        example.unreachableSwitchStatement();
    }
}