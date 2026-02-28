import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    // BUG: Regex lookahead assertions should not be contradictory
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("This message should never be printed.");
        } else {
            // This branch is always executed
            System.out.println("This message is always printed.");
        }

        return result;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab")); // Should print false, but it prints true due to the bug
    }
}