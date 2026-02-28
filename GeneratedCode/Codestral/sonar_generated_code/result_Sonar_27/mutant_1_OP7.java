import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // Original code
        map.computeIfAbsent(key, k -> null);

        // Mutant code based on the Unreachable while loop mutation operator
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This line should never be executed");
        }

        return map;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}