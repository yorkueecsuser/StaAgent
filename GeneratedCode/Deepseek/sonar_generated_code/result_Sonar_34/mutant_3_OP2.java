import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {
    public static void main(String[] args) {
        RegexBugExample rbe = new RegexBugExample();
        rbe.showBug();
    }

    public String showBug() {
        String nonCompliantPattern = "$[a-z]+^"; // BUG: Regex boundaries should not be used in a way that can never be matched
        String nonCompliantPattern2 = "$[a-z]+^"; // MUTANT: Duplicated nonCompliantPattern variable declaration
        Pattern pattern = Pattern.compile(nonCompliantPattern);
        Pattern pattern2 = Pattern.compile(nonCompliantPattern2); // MUTANT: Duplicated pattern variable declaration
        Matcher matcher = pattern.matcher("test");
        Matcher matcher2 = pattern2.matcher("test"); // MUTANT: Duplicated matcher variable declaration
        if (matcher.find()) {
            return matcher.group();
        }
        if (matcher2.find()) { // MUTANT: Duplicated if statement with matcher2
            return matcher2.group();
        }
        return null;
    }
}