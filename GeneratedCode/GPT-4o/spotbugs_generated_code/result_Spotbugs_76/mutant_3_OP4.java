import java.util.List;
import java.util.Map;

class UnrelatedInterfaceComparison {

    public boolean showBug(List<String> list, Map<String, String> map) {
        // Unreachable if-else statement with a runtime condition
        boolean condition = determineCondition(); // This should be a method call or variable
        if (condition) {
            System.out.println("This is an unreachable block"); // Unreachable code
        } else {
            System.out.println("Executing else block"); // This block will execute
        }
        
        // Comparing two unrelated interface types: List and Map
        return list.equals(map); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    // Method to provide a runtime condition, always returns false
    private boolean determineCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        UnrelatedInterfaceComparison example = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        
        boolean result = example.showBug(list, map);
        System.out.println("Comparison result: " + result);
    }
}