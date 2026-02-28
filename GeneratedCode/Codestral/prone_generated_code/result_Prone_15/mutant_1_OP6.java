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

        // Inserted mutant: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable because getCondition() always returns false
        }

        Object obj = bundle.get("key");
        List<String> strings = (List<String>) obj; // BUG: BundleDeserializationCast
        return strings;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // This will throw ClassCastException
    }

    // Dummy method to ensure the mutant is always unreachable
    private boolean getCondition() {
        return false;
    }
}