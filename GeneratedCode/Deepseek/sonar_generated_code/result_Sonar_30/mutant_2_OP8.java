import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class BugExample {

    public void showBug() {
        try {
            Pattern.compile("\\cc"); // Mutated, 'c' is in the '@'-'_' range, but not a recognized control character
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); // BUG: The regex escape sequence \\cX should only be used with characters in the @-_ range
        }

        try {
            Pattern.compile("\\cc"); // Mutated, 'c' is in the '@'-'_' range, but not a recognized control character
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); // BUG: The regex escape sequence \\cX should only be used with characters in the @-_ range
        }
    }

    public void showBugCompliant() {
        Pattern.compile("\\cA"); // Compliant, this will match the "start of heading" control character
        Pattern.compile("\\c^"); // Compliant, this will match the "record separator" control character
    }
}