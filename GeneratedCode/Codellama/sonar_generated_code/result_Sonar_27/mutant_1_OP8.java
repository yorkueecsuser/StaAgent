import java.util.HashMap;
import java.util.Map;

class BuggyMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfAbsent("key3", k -> null); // Noncompliant, the map will not contain an entry key3->null.
        map.computeIfPresent("key2", (k, oldValue) -> null); // Noncompliant

        System.out.println(map);
    }
}

// Renamed variable "map" to "m"
class BuggyMap {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("key1", "value1");
        m.put("key2", "value2");

        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        m.computeIfAbsent("key3", k -> null); // Noncompliant, the map will not contain an entry key3->null.
        m.computeIfPresent("key2", (k, oldValue) -> null); // Noncompliant

        System.out.println(m);
    }
}