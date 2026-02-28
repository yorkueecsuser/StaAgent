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

    public Map<String, String> showBugMutant(String x) {
        Map<String, String> z = new HashMap<>();
        
        // Using computeIfAbsent with a lambda that returns null
        z.computeIfAbsent(x, m -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Using computeIfPresent with a lambda that returns null
        z.computeIfPresent(x, (m, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        return z;
    }

    public static void main(String[] args) {
        MapComputeBugDemo demo = new MapComputeBugDemo();
        Map<String, String> result = demo.showBug("exampleKey");
        System.out.println("Map content: " + result);
        
        Map<String, String> resultMutant = demo.showBugMutant("exampleKey");
        System.out.println("Mutant Map content: " + resultMutant);
    }
}