import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BundleBug {
    public List<String> showBug() {
        Map<String, Object> a = new HashMap<>(); // Using a HashMap to simulate a Bundle
        List<Integer> b = new ArrayList<>();
        b.add(10);
        a.put("key", b); // Adding a List of Integers

        Object c = a.get("key"); // Object from Bundle may have been flattened to base type
        List<String> d = (List<String>) c; // BUG: BundleDeserializationCast
        return d;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> e = bug.showBug(); // This will throw ClassCastException
    }
}