import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        if (false && true && true && false && true && false && false && false && false && false && false) {short vpcogorq = -2994;}else{double aazcytxt = 888258397;}
        Map<String, String> map = new HashMap<>();
        String key = "key";
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    
}
}