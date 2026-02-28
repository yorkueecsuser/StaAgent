import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // Original code
        map.computeIfAbsent(key, k -> null);

        // Mutant code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This branch is unreachable because the method getUnreachableCondition() always returns false
            map.put("unreachableKey", "unreachableValue");
        } else {
            // This branch is always executed
            map.put("reachableKey", "reachableValue");
        }

        return map;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}