import java.util.HashMap;
import java.util.Map;

class MapValueReplacementBug {

    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable
            letters.put("a", "Unreachable");
        }

        return letters.get("a");
    }

    public String showBug2(String[] towns, int i) {
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable
            towns[i] = "Unreachable";
        }

        return towns[i];
    }

    public static void main(String[] args) {
        MapValueReplacementBug bugDemo = new MapValueReplacementBug();
        System.out.println(bugDemo.showBug());  // Output will be "Boy"

        String[] towns = new String[5];
        System.out.println(bugDemo.showBug2(towns, 0));  // Output will be "Chicago"
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
        return false;
    }
}