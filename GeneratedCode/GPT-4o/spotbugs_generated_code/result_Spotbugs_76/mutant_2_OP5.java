import java.util.List;
import java.util.Map;

class UnrelatedInterfaceComparison {

    public boolean showBug(List<String> list, Map<String, String> map) {
        // Comparing two unrelated interface types: List and Map
        boolean comparisonResult = list.equals(map); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        
        // Inserting an unreachable switch statement
        int unreachableVariable = getUnreachableValue(); // Use a method to ensure runtime determination
        switch (unreachableVariable) {
            case 1:
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Do nothing
                break;
        }
        
        return comparisonResult;
    }
    
    // Method to return a value ensuring the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // Ensures that the switch case '1' is never reached
    }
    
    public static void main(String[] args) {
        UnrelatedInterfaceComparison example = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        
        boolean result = example.showBug(list, map);
        System.out.println("Comparison result: " + result);
    }
}