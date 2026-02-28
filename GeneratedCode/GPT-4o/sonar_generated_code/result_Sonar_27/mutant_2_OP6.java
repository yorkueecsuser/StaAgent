import java.util.HashMap;
import java.util.Map;

class MapComputeBugDemo {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();
        
        // Using computeIfAbsent with a lambda that returns null
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Using computeIfPresent with a lambda that returns null
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        // Inserting an unreachable for loop with a non-final variable
        boolean conditionFor = getCondition(); // This method makes the condition non-constant
        for (int i = 0; conditionFor; i++) {
            // Unreachable code because conditionFor is always false
            System.out.println("This will never print.");
        }

        return map;
    }
    
    // Method to simulate a non-final variable, ensuring the loop is unreachable
    private boolean getCondition() {
        return false; // This makes the for loop's condition false at runtime
    }

    public static void main(String[] args) {
        MapComputeBugDemo demo = new MapComputeBugDemo();
        Map<String, String> result = demo.showBug("exampleKey");
        System.out.println("Map content: " + result);
    }
}