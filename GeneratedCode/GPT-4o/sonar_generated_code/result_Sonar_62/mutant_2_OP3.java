import java.util.HashMap;
import java.util.Map;

class RedundantMapStore {

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        
        // Unreachable if statement mutation
        boolean condition = getCondition();  // Method to determine runtime condition
        if (condition) {
            letters.put("a", "Conditionally Unreachable Code");
        }

        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        return letters;
    }

    public String[] showBugWithArray(int i) {
        String[] towns = new String[3];
        towns[i] = "London";

        // Unreachable if statement mutation
        boolean condition = getCondition();  // Method to determine runtime condition
        if (condition) {
            towns[i] = "Conditionally Unreachable City";
        }

        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        return towns;
    }

    // Method to ensure dynamic condition at runtime
    private boolean getCondition() {
        return false;  // This makes the if statement unreachable during runtime
    }

    public static void main(String[] args) {
        RedundantMapStore example = new RedundantMapStore();
        Map<String, String> resultMap = example.showBug();
        System.out.println("Final Map: " + resultMap);

        String[] resultArray = example.showBugWithArray(1);
        System.out.println("Final Array: " + java.util.Arrays.toString(resultArray));
    }
}