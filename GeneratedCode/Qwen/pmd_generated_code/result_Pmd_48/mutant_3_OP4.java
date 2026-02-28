import java.util.ArrayList;
import java.util.List;

class SwitchFallThroughExample {

    public List<String> showBug(int status) {
        List<String> results = new ArrayList<>();
        switch (status) {
            case 1:
                results.add("Status 1");
                // BUG: ImplicitSwitchFallThrough
                boolean shouldRun1 = getCondition();
                if (shouldRun1) {
                    results.add("Unreachable If 1");
                } else {
                    results.add("Unreachable Else 1");
                }
            case 2:
                results.add("Status 2");
                // BUG: ImplicitSwitchFallThrough
                boolean shouldRun2 = getCondition();
                if (shouldRun2) {
                    results.add("Unreachable If 2");
                } else {
                    results.add("Unreachable Else 2");
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
        // This method returns a condition that is always false, but it is not a compile-time constant.
        return false;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1)); // Output: [Status 1, Status 2, Status 3]
        System.out.println(example.showBug(2)); // Output: [Status 2, Status 3]
        System.out.println(example.showBug(3)); // Output: [Status 3]
        System.out.println(example.showBug(4)); // Output: [Default Status]
    }
}