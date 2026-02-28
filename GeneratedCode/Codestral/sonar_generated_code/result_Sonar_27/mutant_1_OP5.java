import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public static boolean getFalseCondition() {
        return false;
    }

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        map.computeIfAbsent(key, k -> null);

        // Unreachable switch statement
        boolean condition = getFalseCondition();
        switch (condition) {
            case true:
                System.out.println("This line will never be executed");
                break;
        }

        return map;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}