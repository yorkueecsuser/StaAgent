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

        System.out.println(map);

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (!condition) {
            // Code to be executed when condition is false
            map.put("key4", "value4");
        } else {
            // Code to be executed when condition is true
            map.put("key5", "value5");
        }
    }

    private static boolean getCondition() {
        // Method to generate a non-final variable or equivalent method call for the condition
        return Math.random() > 0.5;
    }
}