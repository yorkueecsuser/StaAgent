import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfAbsent(key, k -> null);

        return map;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}