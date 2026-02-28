import java.util.List;
import java.util.Map;

class UnrelatedInterfaceComparison {

    public boolean showBug(List<String> list, Map<String, String> map) {
        // Comparing two unrelated interface types: List and Map
        boolean areEqual = list.equals(map); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This value will ensure the switch is unreachable
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            default:
                // Do nothing
                break;
        }

        return areEqual;
    }
    
    private int getUnreachableValue() {
        // This method always returns 0, making the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        UnrelatedInterfaceComparison example = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        
        boolean result = example.showBug(list, map);
        System.out.println("Comparison result: " + result);
    }
}