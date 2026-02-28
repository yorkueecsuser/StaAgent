import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");

        // Mutation: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0; // This value should never be 1 to make the switch unreachable
            switch(value) {
                case 1:
                    letters.put("a", "Boy");
                    break;
            }
        }

        return letters.get("a");
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        // Add logic to return a dynamically determined boolean value
        return false; // For example, always return false to make the switch unreachable
    }
}