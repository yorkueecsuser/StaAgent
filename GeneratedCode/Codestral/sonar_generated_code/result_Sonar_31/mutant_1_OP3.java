import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    // BUG: Regex lookahead assertions should not be contradictory
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time
        Matcher matcher = pattern.matcher(input);

        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            // This branch is unreachable
            System.out.println("This line will never be executed");
        }

        return matcher.find();
    }

    // Method to dynamically get a false condition
    private boolean getFalseCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab")); // Should print false, but it prints true due to the bug
    }
}