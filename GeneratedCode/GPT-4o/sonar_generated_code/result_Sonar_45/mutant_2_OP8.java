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

    // Mutated method with the renamed variable
    public boolean showBugMutant(String input) {
        // This regex pattern has an issue where the anchors ^ and $ do not apply to all alternatives
        Pattern x = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher y = x.matcher(input);
        return y.matches();
    }

    public static void main(String[] args) {
        RegexAnchorBugDemo demo = new RegexAnchorBugDemo();

        // Test cases for the original method
        System.out.println(demo.showBug("a")); // Expected: true (matches ^a)
        System.out.println(demo.showBug("b")); // Expected: false (because b is not anchored)
        System.out.println(demo.showBug("c")); // Expected: true (matches c$)
        System.out.println(demo.showBug("ab")); // Expected: false

        // Test cases for the mutated method
        System.out.println(demo.showBugMutant("a")); // Expected: true (matches ^a)
        System.out.println(demo.showBugMutant("b")); // Expected: false (because b is not anchored)
        System.out.println(demo.showBugMutant("c")); // Expected: true (matches c$)
        System.out.println(demo.showBugMutant("ab")); // Expected: false
    }
}