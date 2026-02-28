import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable since the condition is always false
        }

        letters.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally
        return letters.get("a");
    }

    // Method to return a false condition dynamically
    private boolean getCondition() {
        return false;
    }
}