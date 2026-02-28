import java.util.HashMap;
import java.util.Map;

class MapBugExample {

    public Object showBug1(String key) {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        
        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            map.put(key, "unreachableValue");
        }
        
        return map.get(key);
    }

    public Object showBug2(String key) {
        Map<String, String> map = new HashMap<>();
        map.put(key, "initialValue");
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        
        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            map.put(key, "unreachableValue");
        }
        
        return map.get(key);
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        MapBugExample example = new MapBugExample();
        System.out.println("showBug1 result: " + example.showBug1("key1")); // Expected: null
        System.out.println("showBug2 result: " + example.showBug2("key2")); // Expected: null
    }
}