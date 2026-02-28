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

    // Mutated method with renaming
    public boolean showBugMutant(String input) {
        // Renaming 'pattern' to 'x'
        Pattern x = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = x.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegexAnchorBugDemo demo = new RegexAnchorBugDemo();

        // Test original method
        System.out.println("Original Method:");
        System.out.println(demo.showBug("a")); // Expected: true (matches ^a)
        System.out.println(demo.showBug("b")); // Expected: false (because b is not anchored)
        System.out.println(demo.showBug("c")); // Expected: true (matches c$)
        System.out.println(demo.showBug("ab")); // Expected: false

        // Test mutated method
        System.out.println("Mutated Method:");
        System.out.println(demo.showBugMutant("a")); // Expected: true (matches ^a)
        System.out.println(demo.showBugMutant("b")); // Expected: false (because b is not anchored)
        System.out.println(demo.showBugMutant("c")); // Expected: true (matches c$)
        System.out.println(demo.showBugMutant("ab")); // Expected: false
    }
}