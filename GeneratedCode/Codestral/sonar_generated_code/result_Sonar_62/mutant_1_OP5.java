import java.util.HashMap;
import java.util.Map;

class MapBug {
    private static int getValue() {
        return 0;  // This method will always return 0, making the switch condition unreachable
    }

    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy"); // Original bug: Map values should not be replaced unconditionally

        // Inserted unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return letters.get("a");
    }
}