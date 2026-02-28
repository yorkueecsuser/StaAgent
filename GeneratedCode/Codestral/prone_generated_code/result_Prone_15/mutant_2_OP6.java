import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BundleBug {
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public List<String> showBug() {
        Map<String, Object> bundle = new HashMap<>(); // Using a HashMap to simulate a Bundle
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        bundle.put("key", integers); // Adding a List of Integers

        // Inserting unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop is unreachable");
        }

        Object obj = bundle.get("key"); // Object from Bundle may have been flattened to base type
        List<String> strings = (List<String>) obj; // BUG: BundleDeserializationCast
        return strings;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // This will throw ClassCastException
    }
}