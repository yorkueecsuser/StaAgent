import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BundleBug {
    private boolean unreachableCondition() {
        return false;
    }

    public List<String> showBug() {
        Map<String, Object> bundle = new HashMap<>(); // Using a HashMap to simulate a Bundle
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        bundle.put("key", integers); // Adding a List of Integers

        Object obj = bundle.get("key"); // Object from Bundle may have been flattened to base type
        List<String> strings = (List<String>) obj; // BUG: BundleDeserializationCast

        // Unreachable if-else statement mutation operator
        if (unreachableCondition()) {
            throw new RuntimeException("This should never be executed.");
        } else {
            // Alternative code that will not be executed due to the unreachableCondition()
            System.out.println("This is an alternative code block that should not be executed.");
        }

        return strings;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // This will throw ClassCastException
    }
}