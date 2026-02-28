import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public String showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("ab");
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
            // Inserting unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                result.append("reachable");
            } else {
                result.append("unreachable");
            }
        }
        return result.toString();
    }

    private boolean getCondition() {
        // This method will always return false, making the else branch effectively unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }
}