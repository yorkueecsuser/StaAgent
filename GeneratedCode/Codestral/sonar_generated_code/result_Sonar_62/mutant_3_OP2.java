import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy"); // Original assignment
        letters.put("a", "Boy"); // Mutant: Duplicated assignment
        return letters.get("a");
    }
}