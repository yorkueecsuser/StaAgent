import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BundleBug {
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public List<String> showBug() {
        Map<String, Object> bundle = new HashMap<>();
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        bundle.put("key", integers);

        Object obj = bundle.get("key");

        // Adding the unreachable while loop here
        while (getCondition()) {
            // Unreachable code block
            System.out.println("This line should never be executed.");
        }

        List<String> strings = (List<String>) obj; // BUG: BundleDeserializationCast
        return strings;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // This will throw ClassCastException
    }
}