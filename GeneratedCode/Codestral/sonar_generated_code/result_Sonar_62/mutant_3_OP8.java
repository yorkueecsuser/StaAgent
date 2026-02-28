import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> mappedLetters = new HashMap<>();
        mappedLetters.put("a", "Apple");
        mappedLetters.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally
        return mappedLetters.get("a");
    }
}