import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class BugExample {

    public void showBug() {
        try {
            String notUsed1 = "notUsed1";
            Pattern.compile("\\ca"); // Noncompliant, 'a' is not an upper case letter
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); // BUG: The regex escape sequence \\cX should only be used with characters in the @-_ range
        }

        try {
            String notUsed2 = "notUsed2";
            Pattern.compile("\\c!"); // Noncompliant, '!' is outside of the '@'-'_' range
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage()); // BUG: The regex escape sequence \\cX should only be used with characters in the @-_ range
        }
    }

    public void showBugCompliant() {
        String notUsed3 = "notUsed3";
        Pattern.compile("\\cA"); // Compliant, this will match the "start of heading" control character
        String notUsed4 = "notUsed4";
        Pattern.compile("\\c^"); // Compliant, this will match the "record separator" control character
    }
}