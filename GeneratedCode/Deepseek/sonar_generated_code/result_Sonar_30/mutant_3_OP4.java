import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class BugExample {

    public void showBug() {
        try {
            Pattern.compile("\\cA"); // Mutant - Compliant, this will match the "start of heading" control character
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); // BUG: The regex escape sequence \\cX should only be used with characters in the @-_ range
        }

        try {
            Pattern.compile("\\c^"); // Mutant - Compliant, this will match the "record separator" control character
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); // BUG: The regex escape sequence \\cX should only be used with characters in the @-_ range
        }
    }

    public void showBugCompliant() {
        Pattern.compile("\\ca"); // Compliant, this will match the "start of heading" control character
        Pattern.compile("\\c!"); // Compliant, this will match the "record separator" control character
    }
}