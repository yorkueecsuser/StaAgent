import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");

        // Mutant code (Renaming mutation)
        Map<String, String> m = new HashMap<>();
        m.put("a", "Boy");

        return letters.get("a");
    }
}