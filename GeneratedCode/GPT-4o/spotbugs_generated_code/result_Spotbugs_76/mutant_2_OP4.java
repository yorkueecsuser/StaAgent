import java.util.List;
import java.util.Map;

class UnrelatedInterfaceComparison {

    public boolean showBug(List<String> list, Map<String, String> map) {
        // Inserting unreachable if-else branch
        boolean condition = getCondition(); // Non-final variable to avoid unreachable statement error
        if (condition) {
            System.out.println("This branch is never executed.");
        } else {
            System.out.println("Entering else branch.");
        }
        
        // Comparing two unrelated interface types: List and Map
        return list.equals(map); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
    
    private boolean getCondition() {
        return false; // This makes the if branch unreachable.
    }
    
    public static void main(String[] args) {
        UnrelatedInterfaceComparison example = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        
        boolean result = example.showBug(list, map);
        System.out.println("Comparison result: " + result);
    }
}