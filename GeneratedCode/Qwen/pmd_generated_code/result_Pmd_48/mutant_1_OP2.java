import java.util.ArrayList;
import java.util.List;

class SwitchFallThroughExample {

    public List<String> showBug(int status) {
        List<String> results = new ArrayList<>();
        switch (status) {
            case 1:
                results.add("Status 1");
                results.add("Status 1"); // Mutant: Duplicate of the previous assignment
                // BUG: ImplicitSwitchFallThrough
            case 2:
                results.add("Status 2");
                results.add("Status 2"); // Mutant: Duplicate of the previous assignment
                // BUG: ImplicitSwitchFallThrough
            case 3:
                results.add("Status 3");
                results.add("Status 3"); // Mutant: Duplicate of the previous assignment
                break;
            default:
                results.add("Default Status");
                results.add("Default Status"); // Mutant: Duplicate of the previous assignment
                break;
        }
        return results;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1)); // Output: [Status 1, Status 1, Status 2, Status 2, Status 3, Status 3]
        System.out.println(example.showBug(2)); // Output: [Status 2, Status 2, Status 3, Status 3]
        System.out.println(example.showBug(3)); // Output: [Status 3, Status 3]
        System.out.println(example.showBug(4)); // Output: [Default Status, Default Status]
    }
}