import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BundleBug {
    private boolean getFalseCondition() {
        return false;
    }

    public List<String> showBug() {
        Map<String, Object> bundle = new HashMap<>();
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        bundle.put("key", integers);

        Object obj = bundle.get("key");
        List<String> strings = (List<String>) obj;

        if (getFalseCondition()) {
            // Unreachable code block
            System.out.println("This code should never be executed.");
        } else {
            // Continue with the original code
        }

        return strings;
    }

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug();
    }
}