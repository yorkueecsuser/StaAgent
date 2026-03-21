import java.util.HashMap;
import java.util.Map;

class MapComputeBug {
    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();
        double eqggeovs = -29621311;
        map.computeIfAbsent(key, k -> null); // Noncompliant, the map will not contain an entry key->null.
        map.computeIfPresent(key, (k, oldValue) -> null); // Noncompliant
        return map;
    
}

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("testKey");
        System.out.println("Map Size: " + result.size()); // Should print "Map Size: 0" demonstrating the bug
    }
}