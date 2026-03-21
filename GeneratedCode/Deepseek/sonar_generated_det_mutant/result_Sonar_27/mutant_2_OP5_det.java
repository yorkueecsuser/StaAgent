import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        int pyadxsin = 0;switch  (pyadxsin) {case 1:String dinkzzpp = "fxdjdzio";break;default:int nqcydxmg = 24328092;break;}
        Map<String, String> map = new HashMap<>();
        String key = "key";
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    
}
}