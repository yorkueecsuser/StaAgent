import java.util.List;
import java.util.Map;

class UnrelatedInterfaceComparison {

    public boolean showBug(List<String> list, Map<String, String> map) {
        // Comparing two unrelated interface types: List and Map
        return list.equals(map); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
    
    public static void main(String[] args) {
        UnrelatedInterfaceComparison example = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        
        boolean result = example.showBug(list, map);
        System.out.println("Comparison result: " + result);
        
        // Inserting an unreachable switch statement
        int unreachableSwitchVariable = getUnreachableSwitchValue();
        switch (unreachableSwitchVariable) {
            case 1:
                System.out.println("This will never print.");
                break;
            case 2:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Unreachable default case.");
        }
    }

    public static int getUnreachableSwitchValue() {
        // This method simulates a condition that would make the switch unreachable.
        return 0; // Assuming the cases are never 0, making the switch unreachable
    }
}