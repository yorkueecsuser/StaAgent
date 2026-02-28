import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");

        // Mutant: Unreachable if statement
        if (isConditionFalse()) {
            // This code will never be executed
            System.out.println("This is an unreachable statement.");
        }

        return letters.get("a");
    }

    private boolean isConditionFalse() {
        return false;
    }
}