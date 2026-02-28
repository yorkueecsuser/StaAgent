import java.util.HashMap;
import java.util.Map;

class MapBug {
    private boolean getCondition() {
        // A method to ensure the condition is not a compile-time constant
        return false;
    }

    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");

        // Mutant code: Unreachable if-else statement
        if (getCondition()) {
            letters.put("a", "Boy");
        } else {
            letters.put("a", "Unreachable");
        }

        return letters.get("a");
    }
}