import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    private boolean getFalse() {
        return false;
    }

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        map.computeIfAbsent(key, k -> null);

        // Mutant: Unreachable for loop
        for (int i = 0; getFalse(); i++) {
            System.out.println("This is an unreachable loop");
        }

        return map;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}