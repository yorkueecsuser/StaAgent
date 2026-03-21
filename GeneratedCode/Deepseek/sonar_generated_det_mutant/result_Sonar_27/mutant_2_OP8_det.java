import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        Map<String, String> map = new HashMap<>();
        String uwkedgcf = "uwkedgcf";
        map.computeIfAbsent(uwkedgcf, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(uwkedgcf, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    }
}