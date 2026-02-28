import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyCode {

    public static void showBug() {
        Pattern pattern = Pattern.compile("(a|b)*"); // Noncompliant
        Matcher matcher = pattern.matcher("a".repeat(10000));
        if (matcher.matches()) {
            System.out.println("Matched");
        }
        else {
            System.out.println("Did not match");
        }
    }

    // BUG: Regular expressions should not overflow the stack
    public static void showCompliant() {
        Pattern pattern = Pattern.compile("[ab]*"); // Character classes don't cause recursion the way that '|' does
        Matcher matcher = pattern.matcher("a".repeat(10000));
        if (matcher.matches()) {
            System.out.println("Matched");
        }
        else {
            System.out.println("Did not match");
        }
    }

    public static void main(String[] args) {
        showBug();
        showCompliant();
    }
}