import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        // Original code
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally

        // Mutant code
        String deadStore = "UnusedVariable"; // Dead store mutant

        return letters.get("a");
    }
}