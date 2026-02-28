import java.util.HashMap;
import java.util.Map;

class MapComputeBugDemo {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();
        
        // Using computeIfAbsent with a lambda that returns null
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" should not be used to add "null" values.

        // Using computeIfPresent with a lambda that returns null
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfPresent()" should not be used to add "null" values.

        // Inserting an unreachable switch statement
        int unreachableSwitchVariable = getUnreachableCondition();
        switch (unreachableSwitchVariable) {
            case 1:
                System.out.println("This case should never be reached.");
                break;
            default:
                // Default case to ensure the switch statement is complete
                break;
        }

        return map;
    }

    private int getUnreachableCondition() {
        // This method always returns a value that makes the switch statement unreachable
        return 2; // This value doesn't match any case in the switch
    }

    public static void main(String[] args) {
        MapComputeBugDemo demo = new MapComputeBugDemo();
        Map<String, String> result = demo.showBug("exampleKey");
        System.out.println("Map content: " + result);
    }
}