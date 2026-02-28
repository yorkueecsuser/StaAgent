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
        
        // Unreachable while loop start
        while (false) {
            System.out.println("This loop is unreachable and never runs.");
        }
        // Unreachable while loop end
        
        return map;
    }
}