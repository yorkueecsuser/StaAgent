import java.util.HashMap;
import java.util.Map;

class RedundantMapStore {

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        // Unreachable for loop
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            letters.put("z", "Zebra");
        }

        return letters;
    }

    public String[] showBugWithArray(int i) {
        String[] towns = new String[3];
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        // Unreachable for loop
        boolean conditionForArray = getConditionForLoop();
        for (int j = 0; conditionForArray; j++) {
            // This code is unreachable
            towns[j] = "Paris";
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

    // Helper method to ensure false condition is not a compile-time constant
    private boolean getConditionForLoop() {
        return false;
    }
}