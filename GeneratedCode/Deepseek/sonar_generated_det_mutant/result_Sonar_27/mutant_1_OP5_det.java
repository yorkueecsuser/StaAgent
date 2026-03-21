import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        int fwbryyhm = 0;switch  (fwbryyhm) {case 1:int vfrsakhn = 627200723;break;default:boolean vlwintjs = true;break;}
        Map<String, String> map = new HashMap<>();
        String key = "key";
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    
}
}