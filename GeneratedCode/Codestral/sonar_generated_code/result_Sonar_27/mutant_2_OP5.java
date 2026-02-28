import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    // Helper method to always return a false value
    private boolean getFalseCondition() {
        return false;
    }

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfAbsent(key, k -> null);

        // Mutant code: Unreachable switch statement
        int value = key.length(); // Using a dynamically determined value
        switch (value) {
            case 1:
                if (getFalseCondition()) { // Using a dynamically determined condition
                    System.out.println("This line is unreachable");
                }
                break;
            default:
                break;
        }

        return map;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}