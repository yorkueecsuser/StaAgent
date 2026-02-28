import java.util.HashMap;
import java.util.Map;

class MapBugExample {

    public Object showBug1(String key) {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(key);
    }

    public Object showBug1Mutant(String a) {
        Map<String, String> b = new HashMap<>();
        b.computeIfAbsent(a, c -> null); // Mutant: Renamed variables key to a, map to b, k to c
        return b.get(a);
    }

    public Object showBug2(String key) {
        Map<String, String> map = new HashMap<>();
        map.put(key, "initialValue");
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(key);
    }

    public Object showBug2Mutant(String d) {
        Map<String, String> e = new HashMap<>();
        e.put(d, "initialValue");
        e.computeIfPresent(d, (f, g) -> null); // Mutant: Renamed variables key to d, map to e, k to f, oldValue to g
        return e.get(d);
    }

    public static void main(String[] args) {
        MapBugExample example = new MapBugExample();
        System.out.println("showBug1 result: " + example.showBug1("key1")); // Expected: null
        System.out.println("showBug1Mutant result: " + example.showBug1Mutant("key1")); // Expected: null
        System.out.println("showBug2 result: " + example.showBug2("key2")); // Expected: null
        System.out.println("showBug2Mutant result: " + example.showBug2Mutant("key2")); // Expected: null
    }
}