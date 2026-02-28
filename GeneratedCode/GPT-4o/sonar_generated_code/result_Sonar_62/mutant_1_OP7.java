import java.util.HashMap;
import java.util.Map;

class RedundantMapStore {

    // Method to simulate a condition for while loop
    private boolean getCondition() {
        return false;
    }

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never print");
        }

        return letters;
    }

    public String[] showBugWithArray(int i) {
        String[] towns = new String[3];
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never print");
        }

        return towns;
    }

    public static void main(String[] args) {
        RedundantMapStore example = new RedundantMapStore();
        Map<String, String> resultMap = example.showBug();
        System.out.println("Final Map: " + resultMap);

        String[] resultArray = example.showBugWithArray(1);
        System.out.println("Final Array: " + java.util.Arrays.toString(resultArray));
    }
}