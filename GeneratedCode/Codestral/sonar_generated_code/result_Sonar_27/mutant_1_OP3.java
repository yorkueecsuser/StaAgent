import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfAbsent(key, k -> null);

        // MUTANT: Added an unreachable if statement
        if (getUnreachableCondition()) {
            throw new RuntimeException("This line is unreachable.");
        }

        return map;
    }

    // Method to get a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}