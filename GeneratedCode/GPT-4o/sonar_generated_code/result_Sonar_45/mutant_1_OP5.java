import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugDemo {

    // Method to demonstrate the bug
    public boolean showBug(String input) {
        // This regex pattern has an issue where the anchors ^ and $ do not apply to all alternatives
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegexAnchorBugDemo demo = new RegexAnchorBugDemo();

        // Test cases
        System.out.println(demo.showBug("a")); // Expected: true (matches ^a)
        System.out.println(demo.showBug("b")); // Expected: false (because b is not anchored)
        System.out.println(demo.showBug("c")); // Expected: true (matches c$)
        System.out.println(demo.showBug("ab")); // Expected: false

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999:
                System.out.println("This case is unreachable.");
                break;
            default:
                // Default case for switch statement
                break;
        }
    }

    // Method to provide a dynamically determined value for the switch statement
    private static int getUnreachableValue() {
        return 0; // This ensures the "case 999" is never reached
    }
}