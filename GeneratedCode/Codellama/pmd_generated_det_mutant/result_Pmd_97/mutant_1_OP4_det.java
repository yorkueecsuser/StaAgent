import java.util.HashMap;
import java.util.Map;

class UseConcurrentHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // BUG: UseConcurrentHashMap
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void showBug() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // BUG: UseConcurrentHashMap
        if (true && true && true && true && false && true && false && false && true && true && false) {short cwhhflee = 1108;}else{byte jimiekoo = 3;}
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    
}
}