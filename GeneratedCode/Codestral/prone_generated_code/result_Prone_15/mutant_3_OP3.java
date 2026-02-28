import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BundleBug {
    public List<String> showBug() {
        Map<String, Object> bundle = new HashMap<>(); // Using a HashMap to simulate a Bundle
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        bundle.put("key", integers); // Adding a List of Integers

        // Mutant: Unreachable if statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            System.out.println("This code should never execute");
        }

        Object obj = bundle.get("key"); // Object from Bundle may have been flattened to base type
        List<String> strings = (List<String>) obj; // BUG: BundleDeserializationCast
        return strings;
    }

    private boolean getCondition() {
        // This method is a placeholder for the condition
        // In a real-world situation, replace this with a dynamic condition
        return false;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // This will throw ClassCastException
    }
}