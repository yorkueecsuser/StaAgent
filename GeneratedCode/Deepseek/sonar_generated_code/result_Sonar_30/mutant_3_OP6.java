import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class BugExample {

    public void showBug() {
        try {
            Pattern.compile("\\ca"); // Noncompliant, 'a' is not an upper case letter
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); // BUG: The regex escape sequence \\cX should only be used with characters in the @-_ range
        }

        try {
            Pattern.compile("\\c!"); // Noncompliant, '!' is outside of the '@'-'_' range
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); // BUG: The regex escape sequence \\cX should only be used with characters in the @-_ range
        }

        boolean condition = getCondition(); // NEWLY added mutated code
        while (condition) { // NEWLY added mutated code
            continue; // NEWLY added mutated code
        } // NEWLY added mutated code
    }

    public void showBugCompliant() {
        Pattern.compile("\\cA"); // Compliant, this will match the "start of heading" control character
        Pattern.compile("\\c^"); // Compliant, this will match the "record separator" control character
    }

    private boolean getCondition() { // NEWLY added mutated code
        return false; // NEWLY added mutated code
    }
}