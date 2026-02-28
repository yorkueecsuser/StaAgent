import java.util.List;
import java.util.Map;

class UnrelatedInterfaceComparison {

    public boolean showBug(List<String> list, Map<String, String> map) {
        // Comparing two unrelated interface types: List and Map
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
        return list.equals(map); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
    
    private boolean getCondition() {
        return false; // The condition is always false, making the loop unreachable.
    }

    public static void main(String[] args) {
        UnrelatedInterfaceComparison example = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        
        boolean result = example.showBug(list, map);
        System.out.println("Comparison result: " + result);
    }
}