import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            letters.put("a", "Boy"); // Unreachable code
        }
        return letters.get("a");
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }
}