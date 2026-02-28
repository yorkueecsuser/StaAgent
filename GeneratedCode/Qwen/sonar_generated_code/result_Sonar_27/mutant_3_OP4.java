import java.util.HashMap;
import java.util.Map;

class MapBugExample {

    public Object showBug1(String key) {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        
        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            map.put("mutantKey", "mutantValue");
        } else {
            map.put("mutantKey", "anotherMutantValue");
        }
        
        return map.get(key);
    }

    public Object showBug2(String key) {
        Map<String, String> map = new HashMap<>();
        map.put(key, "initialValue");
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        
        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            map.remove("mutantKey");
        } else {
            map.put("mutantKey", "yetAnotherMutantValue");
        }
        
        return map.get(key);
    }

    private boolean getCondition() {
        // This method should return a condition that is dynamically determined at runtime
        // For demonstration purposes, we return false, but in a real scenario, this could be more complex
        return false;
    }

    public static void main(String[] args) {
        MapBugExample example = new MapBugExample();
        System.out.println("showBug1 result: " + example.showBug1("key1")); // Expected: null
        System.out.println("showBug2 result: " + example.showBug2("key2")); // Expected: null
    }
}