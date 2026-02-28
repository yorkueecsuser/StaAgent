import java.util.HashMap;
import java.util.Map;

class BuggyMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfAbsent("key3", k -> null); // Noncompliant, the map will not contain an entry key3->null.
        map.computeIfPresent("key2", (k, oldValue) -> null); // Noncompliant

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
        case 1:
            System.out.println("Unreachable code!");
            break;
        default:
            System.out.println("Default case");
            break;
        }

        System.out.println(map);
    }
    
    // Method to get a dynamic value for switch expression
    public static int getValue() {
        return 0;
    }
}