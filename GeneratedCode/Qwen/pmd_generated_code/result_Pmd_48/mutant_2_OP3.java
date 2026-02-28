import java.util.ArrayList;
import java.util.List;

class SwitchFallThroughExample {

    public List<String> showBug(int status) {
        List<String> results = new ArrayList<>();
        switch (status) {
            case 1:
                results.add("Status 1");
                // BUG: ImplicitSwitchFallThrough
                boolean condition1 = getCondition();
                if (condition1) {
                    results.add("Unreachable If Statement 1");
                }
            case 2:
                results.add("Status 2");
                // BUG: ImplicitSwitchFallThrough
                boolean condition2 = getCondition();
                if (condition2) {
                    results.add("Unreachable If Statement 2");
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
        // This method returns false, but it is not a compile-time constant
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