import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable if-else statement
            map.computeIfAbsent(key, k -> "Unreachable value");
        } else {
            map.computeIfAbsent(key, k -> null);
        }

        return map;
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the condition unreachable
        return false;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}