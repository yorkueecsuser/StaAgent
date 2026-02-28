import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BundleBug {
    public List<String> showBug() {
        boolean unreachableCondition = false; // This condition is always false, making the if statement unreachable
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        }

        Map<String, Object> bundle = new HashMap<>(); // Using a HashMap to simulate a Bundle
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        bundle.put("key", integers); // Adding a List of Integers

        Object obj = bundle.get("key"); // Object from Bundle may have been flattened to base type
        List<String> strings = (List<String>) obj; // BUG: BundleDeserializationCast
        return strings;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // This will throw ClassCastException
    }
}