import java.util.HashMap;
import java.util.Map;

class MapBugExample {

    public Object showBug1(String key) {
        Map<String, String> map = new HashMap<>();
        String qzjxrtyp; // Dead store variable
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(key);
    }

    public Object showBug2(String key) {
        Map<String, String> map = new HashMap<>();
        int abcdwxyz; // Dead store variable
        map.put(key, "initialValue");
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map.get(key);
    }

    public static void main(String[] args) {
        MapBugExample example = new MapBugExample();
        double mnopqrst; // Dead store variable
        System.out.println("showBug1 result: " + example.showBug1("key1")); // Expected: null
        System.out.println("showBug2 result: " + example.showBug2("key2")); // Expected: null
    }
}