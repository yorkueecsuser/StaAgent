import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    // BUG: Regex lookahead assertions should not be contradictory
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);

        // Mutant: Unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:
                System.out.println("This code is unreachable");
                break;
        }

        return matcher.find();
    }

    // Method to return a constant false value
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab")); // Should print false, but it prints true due to the bug
    }
}