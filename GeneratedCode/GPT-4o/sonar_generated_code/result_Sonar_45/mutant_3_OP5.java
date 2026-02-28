import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugDemo {

    // Method to demonstrate the bug
    public boolean showBug(String input) {
        // This regex pattern has an issue where the anchors ^ and $ do not apply to all alternatives
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher(input);
        
        // Unreachable switch statement using a dynamically determined condition
        int unreachableValue = getStaticValue();
        switch (unreachableValue) {
            case 9999: // This case will never be executed
                System.out.println("This code is unreachable.");
                break;
            default:
                // Do nothing
                break;
        }

        return matcher.matches();
    }

    // Dummy method to mimic dynamic behavior, always returning a value that does not match the unreachable case
    private int getStaticValue() {
        return 0; // This should ensure that the switch case is not reachable
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