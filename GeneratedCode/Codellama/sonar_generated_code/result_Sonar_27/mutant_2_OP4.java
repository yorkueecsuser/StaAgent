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

        boolean isKey3Present = map.containsKey("key3");
        if (isKey3Present) {
            // Unreachable if-else statement
            if (false) {
                map.put("key3", null);
            } else {
                // do nothing
            }
        } else {
            map.put("key3", null);
        }
    }
}