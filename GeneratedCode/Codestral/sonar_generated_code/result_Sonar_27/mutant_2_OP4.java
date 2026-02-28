import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    private boolean getCondition() {
        return false;
    }

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // Original code
        map.computeIfAbsent(key, k -> null);

        // Mutated code: Unreachable if-else statement
        if (getCondition()) {
            // This code is unreachable
            System.out.println("This line should not be executed");
        } else {
            // This is the else branch of the unreachable if-else statement
            // It is also unreachable
            System.out.println("This line should also not be executed");
        }

        return map;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}