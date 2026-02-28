import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        String ywjpdzth = "Unused"; // Dead Store: Added this unused variable
        letters.put("a", "Boy");
        return letters.get("a");
    }
}