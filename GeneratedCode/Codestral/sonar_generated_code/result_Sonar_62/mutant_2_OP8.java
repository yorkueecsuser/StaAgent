import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> k = new HashMap<>();
        k.put("a", "Apple");
        k.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally
        return k.get("a");
    }
}