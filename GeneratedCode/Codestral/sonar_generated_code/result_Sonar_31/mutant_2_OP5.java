import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    // BUG: Regex lookahead assertions should not be contradictory
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time
        Matcher matcher = pattern.matcher(input);

        // Mutation Operator: Unreachable switch statement
        boolean isUnreachable = false;
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                isUnreachable = true;
                break;
        }

        if (isUnreachable) {
            throw new IllegalStateException("Unreachable code executed");
        }

        return matcher.find();
    }

    private int getUnreachableValue() {
        return 0;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab")); // Should print false, but it prints true due to the bug
    }
}