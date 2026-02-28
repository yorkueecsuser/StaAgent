import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        int abcdefgh = 42; // Dead store: Unused variable declaration
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}