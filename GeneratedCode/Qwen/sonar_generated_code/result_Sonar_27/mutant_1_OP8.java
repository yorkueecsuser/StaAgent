import java.util.HashMap;
import java.util.Map;

class MapBugExample {

    public Object showBug1(String key) {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(key);
    }

    public Object showBug1_mutated(String x) {
        Map<String, String> m = new HashMap<>();
        m.computeIfAbsent(x, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return m.get(x);
    }

    public Object showBug2(String key) {
        Map<String, String> map = new HashMap<>();
        map.put(key, "initialValue");
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(key);
    }

    public Object showBug2_mutated(String y) {
        Map<String, String> n = new HashMap<>();
        n.put(y, "initialValue");
        n.computeIfPresent(y, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return n.get(y);
    }

    public static void main(String[] args) {
        MapBugExample example = new MapBugExample();
        System.out.println("showBug1 result: " + example.showBug1("key1")); // Expected: null
        System.out.println("showBug1_mutated result: " + example.showBug1_mutated("key1")); // Expected: null
        System.out.println("showBug2 result: " + example.showBug2("key2")); // Expected: null
        System.out.println("showBug2_mutated result: " + example.showBug2_mutated("key2")); // Expected: null
    }
}