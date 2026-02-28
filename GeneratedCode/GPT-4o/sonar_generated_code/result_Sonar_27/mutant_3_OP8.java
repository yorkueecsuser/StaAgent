import java.util.HashMap;
import java.util.Map;

class MapComputeBugDemo {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();
        
        // Using computeIfAbsent with a lambda that returns null
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Using computeIfPresent with a lambda that returns null
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        return map;
    }
    
    // Mutant method with renamed variable
    public Map<String, String> showBugMutant(String z) {
        Map<String, String> m = new HashMap<>();
        
        // Using computeIfAbsent with a lambda that returns null
        m.computeIfAbsent(z, k -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Using computeIfPresent with a lambda that returns null
        m.computeIfPresent(z, (k, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        return m;
    }

    public static void main(String[] args) {
        MapComputeBugDemo demo = new MapComputeBugDemo();
        Map<String, String> result = demo.showBug("exampleKey");
        System.out.println("Map content: " + result);
        
        // Testing the mutant method
        Map<String, String> mutantResult = demo.showBugMutant("exampleKey");
        System.out.println("Mutant Map content: " + mutantResult);
    }
}