import java.util.List;
import java.util.Map;

class UnrelatedInterfaceComparison {

    public boolean showBug(List<String> l, Map<String, String> map) {
        // Comparing two unrelated interface types: List and Map
        return l.equals(map); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
    
    public static void main(String[] args) {
        UnrelatedInterfaceComparison example = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> m = Map.of("key1", "value1", "key2", "value2");
        
        boolean result = example.showBug(list, m);
        System.out.println("Comparison result: " + result);
    }
}