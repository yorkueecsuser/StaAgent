import java.util.ArrayList;
import java.util.List;

class SwitchFallThroughExample {

    public List<String> showBug(int status) {
        List<String> results = new ArrayList<>();
        switch (status) {
            case 1:
                results.add("Status 1");
                // BUG: ImplicitSwitchFallThrough
            case 2:
                results.add("Status 2");
                // BUG: ImplicitSwitchFallThrough
            case 3:
                results.add("Status 3");
                break;
            default:
                results.add("Default Status");
                break;
        }

        // Introduced Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            switch (getValue()) {
                case 4:
                    results.add("Unreachable Status 4");
                    break;
                case 5:
                    results.add("Unreachable Status 5");
                    break;
                default:
                    results.add("Unreachable Default Status");
                    break;
            }
        }

        return results;
    }

    private boolean getCondition() {
        return false; // This method ensures the switch is unreachable at runtime
    }

    private int getValue() {
        return 0; // This method provides a value for the switch expression
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1)); // Output: [Status 1, Status 2, Status 3]
        System.out.println(example.showBug(2)); // Output: [Status 2, Status 3]
        System.out.println(example.showBug(3)); // Output: [Status 3]
        System.out.println(example.showBug(4)); // Output: [Default Status]
    }
}