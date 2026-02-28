import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    // BUG: Regex lookahead assertions should not be contradictory
    public boolean showBug(String input) {
        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            Pattern pattern = Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time
            Matcher matcher = pattern.matcher(input);
            return matcher.find();
        }
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab")); // Should print false, but it prints true due to the bug
    }
}