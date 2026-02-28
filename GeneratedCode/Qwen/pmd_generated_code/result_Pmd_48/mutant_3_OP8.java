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
        return results;
    }

    // Mutated code
    public List<String> showBug(char x) {
        List<String> a = new ArrayList<>();
        switch (x) {
            case 1:
                a.add("Status 1");
                // BUG: ImplicitSwitchFallThrough
            case 2:
                a.add("Status 2");
                // BUG: ImplicitSwitchFallThrough
            case 3:
                a.add("Status 3");
                break;
            default:
                a.add("Default Status");
                break;
        }
        return a;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1)); // Output: [Status 1, Status 2, Status 3]
        System.out.println(example.showBug(2)); // Output: [Status 2, Status 3]
        System.out.println(example.showBug(3)); // Output: [Status 3]
        System.out.println(example.showBug(4)); // Output: [Default Status]
    }
}