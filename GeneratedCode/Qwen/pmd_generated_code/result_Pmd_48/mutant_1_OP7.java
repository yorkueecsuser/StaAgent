import java.util.ArrayList;
import java.util.List;

class SwitchFallThroughExample {

    public List<String> showBug(int status) {
        List<String> results = new ArrayList<>();
        switch (status) {
            case 1:
                results.add("Status 1");
                // BUG: ImplicitSwitchFallThrough
                boolean conditionWhile1 = getCondition();
                while (conditionWhile1) {
                    // This loop is unreachable because conditionWhile1 is always false
                }
            case 2:
                results.add("Status 2");
                // BUG: ImplicitSwitchFallThrough
                boolean conditionWhile2 = getCondition();
                while (conditionWhile2) {
                    // This loop is unreachable because conditionWhile2 is always false
                }
            case 3:
                results.add("Status 3");
                break;
            default:
                results.add("Default Status");
                break;
        }
        return results;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the while loops unreachable
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1)); // Output: [Status 1, Status 2, Status 3]
        System.out.println(example.showBug(2)); // Output: [Status 2, Status 3]
        System.out.println(example.showBug(3)); // Output: [Status 3]
        System.out.println(example.showBug(4)); // Output: [Default Status]
    }
}