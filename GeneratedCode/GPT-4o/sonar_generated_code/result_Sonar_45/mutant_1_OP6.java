import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexAnchorBugDemo {

    // Method to demonstrate the bug
    public boolean showBug(String input) {
        // This regex pattern has an issue where the anchors ^ and $ do not apply to all alternatives
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher(input);

        // Inserting an unreachable for loop as per the mutation operator
        boolean conditionFor = getCondition(); // Using a method call to ensure it's a runtime determination
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable because conditionFor is always false
            System.out.println("This is unreachable code.");
        }

        return matcher.matches();
    }

    // Method to provide a runtime condition for the unreachable for loop
    private boolean getCondition() {
        return false; // Always returns false
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