import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugDemo {

    // Method to demonstrate the bug
    public boolean showBug(String input) {
        // This regex pattern has an issue where the anchors ^ and $ do not apply to all alternatives
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher(input);

        // Adding an unreachable for loop based on the mutation operator description
        boolean shouldExecute = getCondition();
        for (int i = 0; shouldExecute; i++) {
            System.out.println("This code is unreachable");
        }

        return matcher.matches();
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This makes the loop condition false without using a compile-time constant
    }

    public static void main(String[] args) {
        RegexAnchorBugDemo demo = new RegexAnchorBugDemo();

        // Test cases
        System.out.println(demo.showBug("a")); // Expected: true (matches ^a)
        System.out.println(demo.showBug("b")); // Expected: false (because b is not anchored)
        System.out.println(demo.showBug("c")); // Expected: true (matches c$)
        System.out.println(demo.showBug("ab")); // Expected: false
    }
}