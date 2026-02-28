import java.util.HashMap;
import java.util.Map;

class MapBug {
    private boolean getUnreachableCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy"); // BUG: Map values should not be replaced unconditionally

        // Mutation: Unreachable switch statement
        switch (getUnreachableCondition()) {
            case true:
                // This code will never be executed
                System.out.println("Unreachable code executed");
                break;
        }

        return letters.get("a");
    }
}