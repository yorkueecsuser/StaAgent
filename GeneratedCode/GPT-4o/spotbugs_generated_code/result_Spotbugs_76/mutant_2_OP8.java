import java.util.List;
import java.util.Map;

class UnrelatedInterfaceComparison {

    public boolean showBug(List<String> x, Map<String, String> y) {
        // Comparing two unrelated interface types: List and Map
        return x.equals(y); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
    
    public static void main(String[] args) {
        UnrelatedInterfaceComparison z = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        
        boolean result = z.showBug(list, map);
        System.out.println("Comparison result: " + result);
    }
}