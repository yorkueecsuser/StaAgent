import java.util.HashMap;
import java.util.Map;

class MapBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");

        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            letters.put("a", "Boy"); // This line is unreachable
        }

        return letters.get("a");
    }
}