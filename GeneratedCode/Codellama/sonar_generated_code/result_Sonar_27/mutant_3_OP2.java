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

// Mutant 1: Duplicate the assignment of map.put("key1", "value1");
Map<String, String> map = new HashMap<>();
map.put("key1", "value1");
map.put("key1", "value1");
map.put("key2", "value2");

// Mutant 2: Duplicate the assignment of map.put("key2", "value2");
Map<String, String> map = new HashMap<>();
map.put("key1", "value1");
map.put("key2", "value2");
map.put("key2", "value2");

// Mutant 3: Duplicate the assignment of map.computeIfAbsent("key3", k -> null);
Map<String, String> map = new HashMap<>();
map.put("key1", "value1");
map.put("key2", "value2");
map.computeIfAbsent("key3", k -> null);
map.computeIfAbsent("key3", k -> null);

// Mutant 4: Duplicate the assignment of map.computeIfPresent("key2", (k, oldValue) -> null);
Map<String, String> map = new HashMap<>();
map.put("key1", "value1");
map.put("key2", "value2");
map.computeIfPresent("key2", (k, oldValue) -> null);
map.computeIfPresent("key2", (k, oldValue) -> null);

System.out.println(map);