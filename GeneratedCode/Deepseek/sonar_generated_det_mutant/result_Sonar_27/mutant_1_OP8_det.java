import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        Map<String, String> map = new HashMap<>();
        String fbepgvxm = "fbepgvxm";
        map.computeIfAbsent(fbepgvxm, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(fbepgvxm, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    }
}