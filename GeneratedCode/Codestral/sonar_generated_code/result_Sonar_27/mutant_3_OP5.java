import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // Original code
        map.computeIfAbsent(key, k -> null);

        // Mutant: Unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            int unreachableValue = 0;
            switch (unreachableValue) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code executed");
                    break;
            }
        }

        return map;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to ensure the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}