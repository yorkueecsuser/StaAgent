import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugDemo {

    // Method to demonstrate the bug
    public boolean showBug(String input) {
        // This regex pattern has an issue where the anchors ^ and $ do not apply to all alternatives
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher(input);
        
        // Unreachable if-else statement mutation
        boolean condition = getCondition(); // This method will always return false
        if (condition) {
            // Unreachable code block
            System.out.println("This will never be printed.");
        } else {
            // Reachable code block
            System.out.println("Executing main matching logic.");
        }

        return matcher.matches();
    }

    // Helper method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
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