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
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
            result.append("unreachable");
        }
        
        return result.toString();
    }

    private boolean getCondition() {
        // This method returns false, making the loop condition always false
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }
}