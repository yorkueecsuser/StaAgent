import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {
    public static void main(String[] args) {
        RegexBugExample rbe = new RegexBugExample();
        rbe.showBug();
    }

    public String showBug() {
        String nonCompliantPattern = "$[a-z]+^"; // BUG: Regex boundaries should not be used in a way that can never be matched
        Pattern pattern = Pattern.compile(nonCompliantPattern);
        Matcher matcher = pattern.matcher("test");
        boolean unreachableCondition = false; // Mutant: Unreachable if statement
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}