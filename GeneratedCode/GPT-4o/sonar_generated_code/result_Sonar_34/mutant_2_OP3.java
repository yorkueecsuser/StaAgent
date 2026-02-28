import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        // Mutation applied: Unreachable if statement
        boolean unreachableCondition = false; // Non-final variable to avoid compile-time constant usage
        if (unreachableCondition) {
            System.out.println("This message will never be printed.");
        }

        return matcher.find();
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}