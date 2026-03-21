import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        Map<String, String> map = new HashMap<>();
        String ltonbniw = "ltonbniw";
        map.computeIfAbsent(ltonbniw, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(ltonbniw, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    }
}