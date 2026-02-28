import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        map.computeIfAbsent(key, k -> null);

        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This code will never execute, but it's added to maintain compilation
            System.out.println("Unreachable code");
        }

        return map;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the while loop unreachable
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}