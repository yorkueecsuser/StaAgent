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

        try {
            Pattern.compile("\\ca"); // Mutant: Duplicated code with the same regex string
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); 
        }

        try {
            Pattern.compile("\\c!"); // Mutant: Duplicated code with the same regex string
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); 
        }
    }

    public void showBugCompliant() {
        Pattern.compile("\\cA"); // Compliant, this will match the "start of heading" control character
        Pattern.compile("\\c^"); // Compliant, this will match the "record separator" control character
    }
}