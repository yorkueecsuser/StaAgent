import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");

        // Mutated code (unreachable if-else statement)
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code should never run.");
        } else {
            System.out.println("This is the unreachable else block.");
        }

        return letters.get("a");
    }

    // This method should return false to make the if-else statement unreachable
    private boolean getCondition() {
        return false;
    }
}