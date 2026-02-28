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

        // Mutation: Adding an unused variable declaration of type String with a name of 8 characters.
        String unusedVariable = "deadStore";

        return map;
    }
}