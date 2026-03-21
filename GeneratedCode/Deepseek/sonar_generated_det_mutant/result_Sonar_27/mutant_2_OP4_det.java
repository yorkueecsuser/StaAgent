import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        if (true && true && true && true && false && false && false && false && false && true && false) {String wlsfnetl = "csxwrwjj";}else{int zhwfdaol = 853625643;}
        Map<String, String> map = new HashMap<>();
        String key = "key";
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    
}
}