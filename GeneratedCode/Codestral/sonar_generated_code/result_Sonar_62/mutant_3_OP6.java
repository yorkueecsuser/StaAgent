import java.util.HashMap;
import java.util.Map;

class MapBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");

        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            letters.put("a", "Boy"); // This line will cause a bug if the loop becomes reachable
        }

        return letters.get("a");
    }
}