import java.util.HashMap;
import java.util.Map;

class BugCode {
    public Map<String, String> showBug() {
        int fgpobzcm = 0;switch  (fgpobzcm) {case 1:byte hxrlaxsi = -60;break;default:double sbvrvldw = 530375980;break;}
        Map<String, String> map = new HashMap<>();
        String key = "key";
        map.computeIfAbsent(key, k -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfPresent(key, (k, oldValue) -> null); // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        return map;
    
}
}