import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public String showBug() {
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("ab");
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
            // Inserting unreachable switch statement
            boolean switchCondition = getSwitchCondition();
            switch (switchCondition) {
                case true:
                    // This case is unreachable because getSwitchCondition() always returns false
                    result.append("unreachable");
                    break;
                default:
                    // Default case
                    break;
            }
        }
        return result.toString();
    }

    private boolean getSwitchCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }
}