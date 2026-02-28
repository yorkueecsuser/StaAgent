import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally
        letters.put("a", "Boy"); // Added mutant by duplicating the buggy line
        return letters.get("a");
    }
}