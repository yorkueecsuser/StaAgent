import java.util.HashMap;
import java.util.Map;

class RedundantMapStore {

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        // Unreachable switch statement mutant
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never execute.");
                break;
            default:
                // Default case does nothing
                break;
        }

        return letters;
    }

    public String[] showBugWithArray(int i) {
        String[] towns = new String[3];
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        // Unreachable switch statement mutant
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 2:
                System.out.println("This will never execute either.");
                break;
            default:
                // Default case does nothing
                break;
        }

        return towns;
    }

    private int getUnreachableSwitchValue() {
        return 0; // Ensures that none of the cases in the switch statements are executed
    }

    public static void main(String[] args) {
        RedundantMapStore example = new RedundantMapStore();
        Map<String, String> resultMap = example.showBug();
        System.out.println("Final Map: " + resultMap);

        String[] resultArray = example.showBugWithArray(1);
        System.out.println("Final Array: " + java.util.Arrays.toString(resultArray));
    }
}