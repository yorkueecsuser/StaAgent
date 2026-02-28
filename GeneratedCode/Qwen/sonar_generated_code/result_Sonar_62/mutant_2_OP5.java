import java.util.HashMap;
import java.util.Map;

class MapValueReplacementBug {

    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                letters.put("a", "Unreachable");
                break;
        }

        return letters.get("a");
    }

    public String showBug2(String[] towns, int i) {
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                towns[i] = "Unreachable";
                break;
        }

        return towns[i];
    }

    public static void main(String[] args) {
        MapValueReplacementBug bugDemo = new MapValueReplacementBug();
        System.out.println(bugDemo.showBug());  // Output will be "Boy"

        String[] towns = new String[5];
        System.out.println(bugDemo.showBug2(towns, 0));  // Output will be "Chicago"
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}