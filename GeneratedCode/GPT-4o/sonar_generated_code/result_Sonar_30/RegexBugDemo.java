import java.util.regex.Pattern;

class RegexBugDemo {

    public String showBug(String input) {
        // This pattern uses the control escape sequence incorrectly.
        Pattern pattern = Pattern.compile("\\ca"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        return pattern.pattern();
    }

    public String showBug2(String input) {
        // This pattern uses the control escape sequence incorrectly.
        Pattern pattern = Pattern.compile("\\c!"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        return pattern.pattern();
    }

    public static void main(String[] args) {
        RegexBugDemo demo = new RegexBugDemo();
        System.out.println("Buggy pattern 1: " + demo.showBug(""));
        System.out.println("Buggy pattern 2: " + demo.showBug2(""));
    }
}