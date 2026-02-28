import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");

        // Mutant code: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            letters.put("a", "Unreachable");
        }

        letters.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally
        return letters.get("a");
    }

    // Method for testing purposes, to allow the condition to be dynamically determined
    private boolean getCondition() {
        return false;
    }
}