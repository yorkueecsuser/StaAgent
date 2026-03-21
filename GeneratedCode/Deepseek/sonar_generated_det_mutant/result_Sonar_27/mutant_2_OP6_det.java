import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        for  (int yftrnduq = 0; yftrnduq < 0; yftrnduq++) {double zkhpyxvt = -776236265;}
        Map<String, String> map = new HashMap<>();
        String key = "key";
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    
}
}