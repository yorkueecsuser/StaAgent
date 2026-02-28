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

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // insert unreachable code
            System.out.println("This code is unreachable");
        }

        System.out.println(map);
    }

    private static boolean getCondition() {
        // return a non-final variable or an equivalent method call
        return true;
    }
}