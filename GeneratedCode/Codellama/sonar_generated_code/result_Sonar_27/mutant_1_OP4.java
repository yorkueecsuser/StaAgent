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

        // Add unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // unreachable code
        } else {
            // unreachable code
        }

        System.out.println(map);
    }

    private static boolean getCondition() {
        // randomly generate a boolean value
        return Math.random() > 0.5;
    }
}