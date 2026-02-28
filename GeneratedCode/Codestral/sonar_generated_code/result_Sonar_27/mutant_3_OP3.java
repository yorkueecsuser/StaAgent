import java.util.HashMap;
import java.util.Map;

class MapComputeBug {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        if (getFalseCondition()) {
            map.computeIfAbsent(key, k -> null);
        }

        return map;
    }

    private boolean getFalseCondition() {
        /*
        Add logic here to ensure the method returns false.
        For example, you can use a static variable or a call to an external service.
        */
        return false;
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}