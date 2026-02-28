import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public String showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("ab");
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }

    // Mutated code with renaming operator
    public String showBugMutated() {
        Pattern x = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher y = x.matcher("ab");
        StringBuilder z = new StringBuilder();
        while (y.find()) {
            z.append(y.group());
        }
        return z.toString();
    }

    public static void mainMutated(String[] args) {
        RegexLookaheadBug q = new RegexLookaheadBug();
        System.out.println(q.showBugMutated());
    }
}