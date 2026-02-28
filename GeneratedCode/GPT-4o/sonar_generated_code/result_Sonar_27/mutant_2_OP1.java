import java.util.HashMap;
import java.util.Map;

class MapComputeBugDemo {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();
        
        // Using computeIfAbsent with a lambda that returns null
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Using computeIfPresent with a lambda that returns null
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        // Dead store mutation: adding an unused variable
        int abcdefgh = 42; // This is a dead store, as the variable is never used.

        return map;
    }

    public static void main(String[] args) {
        MapComputeBugDemo demo = new MapComputeBugDemo();
        Map<String, String> result = demo.showBug("exampleKey");
        System.out.println("Map content: " + result);
    }
}