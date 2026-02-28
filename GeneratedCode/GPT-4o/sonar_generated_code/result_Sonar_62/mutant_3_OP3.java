import java.util.HashMap;
import java.util.Map;

class RedundantMapStore {

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            letters.put("z", "Zebra");
        }

        return letters;
    }

    public String[] showBugWithArray(int i) {
        String[] towns = new String[3];
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            towns[0] = "Paris";
        }

        return towns;
    }

    private boolean getCondition() {
        // Always returns false, making the if blocks unreachable
        return Math.random() < 0; // This will always be false
    }

    public static void main(String[] args) {
        RedundantMapStore example = new RedundantMapStore();
        Map<String, String> resultMap = example.showBug();
        System.out.println("Final Map: " + resultMap);

        String[] resultArray = example.showBugWithArray(1);
        System.out.println("Final Array: " + java.util.Arrays.toString(resultArray));
    }
}