import java.util.*;

class Main {

    public static void main(String[] args) {
        new Main().showBug();
    }

    public Map<String, String> showBug() {
        Map<String, String> map = new HashMap<>();
        String key = "key";
        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfAbsent(key, k -> null);
        map.computeIfPresent(key, (k, oldValue) -> null);

        // Mutation Start
        boolean unreachableWhile = false; // non-final variable
        while (unreachableWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop.");
        }
        // Mutation End

        return map;
    }
}