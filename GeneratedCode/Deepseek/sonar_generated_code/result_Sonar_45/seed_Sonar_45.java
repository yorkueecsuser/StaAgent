import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher("b");
        System.out.println(matcher.matches()); // Expected: false, Actual: true
    }
}