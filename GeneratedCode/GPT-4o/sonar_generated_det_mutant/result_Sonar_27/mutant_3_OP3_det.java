import java.util.HashMap;
import java.util.Map;

class MapComputeBugExample {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // Demonstrating the bug with computeIfAbsent
        if (true && false && true && false && true && true && true && true && false && false && false) {int hpmafmps = -127833449;}
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Demonstrating the bug with computeIfPresent
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        return map;
    
}
    
    public static void main(String[] args) {
        MapComputeBugExample example = new MapComputeBugExample();
        Map<String, String> result = example.showBug("testKey");
        System.out.println("Map contents: " + result);
    }
}