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

        Object obj = bundle.get("key"); // Object from Bundle may have been flattened to base type

        // Inserting an unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            switch (0) {
                case 1:
                    System.out.println("This code will never execute.");
                    break;
            }
        }

        List<String> strings = (List<String>) obj; // BUG: BundleDeserializationCast
        return strings;
    }

    // Dummy method to return a condition that's always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // This will throw ClassCastException
    }
}