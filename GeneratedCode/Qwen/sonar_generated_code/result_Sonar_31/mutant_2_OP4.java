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
        
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            result.append("reachable");
        } else {
            result.append("unreachable");
        }
        
        return result.toString();
    }

    private boolean getCondition() {
        return true; // This ensures the if branch is reachable and the else branch is unreachable
    }

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }
}