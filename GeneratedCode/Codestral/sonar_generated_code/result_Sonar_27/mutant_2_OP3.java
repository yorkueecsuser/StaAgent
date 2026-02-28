import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    private boolean unreachableCondition() {
        return false;
    }

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        if (unreachableCondition()) {
            System.out.println("Unreachable code executed.");
        }

        map.computeIfAbsent(key, k -> null);

        return map;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}