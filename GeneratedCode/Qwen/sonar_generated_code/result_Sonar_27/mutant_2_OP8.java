import java.util.HashMap;
import java.util.Map;

class MapBugExample {

    public Object showBug1(String key) {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(key);
    }

    public Object showBug1Mutant(String x) {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent(x, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(x);
    }

    public Object showBug2(String key) {
        Map<String, String> map = new HashMap<>();
        map.put(key, "initialValue");
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(key);
    }

    public Object showBug2Mutant(String y) {
        Map<String, String> map = new HashMap<>();
        map.put(y, "initialValue");
        map.computeIfPresent(y, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(y);
    }

    public static void main(String[] args) {
        MapBugExample example = new MapBugExample();
        System.out.println("showBug1 result: " + example.showBug1("key1")); // Expected: null
        System.out.println("showBug1Mutant result: " + example.showBug1Mutant("key1")); // Expected: null
        System.out.println("showBug2 result: " + example.showBug2("key2")); // Expected: null
        System.out.println("showBug2Mutant result: " + example.showBug2Mutant("key2")); // Expected: null
    }
}