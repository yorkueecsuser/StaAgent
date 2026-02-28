import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");

        boolean unreachableCondition = getUnreachableCondition(); // Method to return a false value
        while (unreachableCondition) {
            // Unreachable while loop
            letters.put("a", "Mutant");
        }

        letters.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally
        return letters.get("a");
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}