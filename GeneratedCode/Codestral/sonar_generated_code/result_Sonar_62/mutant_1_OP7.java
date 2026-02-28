import java.util.HashMap;
import java.util.Map;

class MapBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally

        // Mutant code: Inserting an unreachable while loop
        while (getFalseCondition()) {
            // This block of code is unreachable
            System.out.println("Unreachable code");
        }

        return letters.get("a");
    }
}