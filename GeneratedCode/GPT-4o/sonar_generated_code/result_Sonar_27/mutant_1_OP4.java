import java.util.HashMap;
import java.util.Map;

class MapComputeBugDemo {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();
        
        // Using computeIfAbsent with a lambda that returns null
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Using computeIfPresent with a lambda that returns null
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        boolean unreachableCondition = getCondition(); // Non-final variable to ensure condition is checked at runtime
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }

        return map;
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // Method call ensures this is checked at runtime
    }

    public static void main(String[] args) {
        MapComputeBugDemo demo = new MapComputeBugDemo();
        Map<String, String> result = demo.showBug("exampleKey");
        System.out.println("Map content: " + result);
    }
}