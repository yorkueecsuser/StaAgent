import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public Map<String, String> showBug(String inputKey) {
        Map<String, String> dataMap = new HashMap<>();

        // Mutated code with variable renaming
        dataMap.computeIfAbsent(inputKey, k -> null);

        return dataMap;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}