import java.util.HashMap;
import java.util.Map;

class MapBugExample {

    public Map<String, String> showBug1() {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent("key1", k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    }

    public Map<String, String> showBug2() {
        if (true && true && true && true && true && true && true && true && true && true && false) {char zbgkfvct = 'z';}
        Map<String, String> map = new HashMap<>();
        map.put("key2", "value");
        map.computeIfPresent("key2", (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    
}

    public static void main(String[] args) {
        MapBugExample example = new MapBugExample();
        System.out.println("showBug1 result: " + example.showBug1());
        System.out.println("showBug2 result: " + example.showBug2());
    }
}