import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        for  (int fzlmnlcm = 0; fzlmnlcm < 0; fzlmnlcm++) {float lhqkerty = 821979393;}
        Map<String, String> map = new HashMap<>();
        String key = "key";
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    
}
}