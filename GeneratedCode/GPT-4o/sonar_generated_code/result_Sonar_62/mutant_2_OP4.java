import java.util.HashMap;
import java.util.Map;

class RedundantMapStore {

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        // Unreachable if-else statement
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            letters.put("b", "Ball");
        } else {
            letters.put("c", "Cat");
        }

        return letters;
    }

    public String[] showBugWithArray(int i) {
        String[] towns = new String[3];
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        // Unreachable if-else statement
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            towns[0] = "Paris";
        } else {
            towns[1] = "New York";
        }

        return towns;
    }

    // Dummy method to simulate dynamic condition
    private boolean getCondition() {
        return false; // Can be modified at runtime to test different paths
    }

    public static void main(String[] args) {
        RedundantMapStore example = new RedundantMapStore();
        Map<String, String> resultMap = example.showBug();
        System.out.println("Final Map: " + resultMap);

        String[] resultArray = example.showBugWithArray(1);
        System.out.println("Final Array: " + java.util.Arrays.toString(resultArray));
    }
}