import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public boolean showBug(String input) {
        String unusedVariable = "unusedVar"; // Dead Store mutation
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab")); // Should print false, but it prints true due to the bug
    }
}