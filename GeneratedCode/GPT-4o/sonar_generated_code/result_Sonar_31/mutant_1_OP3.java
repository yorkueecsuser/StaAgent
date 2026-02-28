import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexLookaheadBugDemo {

    public String showBug(String input) {
        // This pattern attempts to match 'b' only if it is preceded by 'a',
        // but because the lookahead is contradictory, it will never match anything.
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher(input);
        
        boolean condition = getCondition(); // Non-final variable to use in if statement
        if (condition) {
            // This is an unreachable branch because condition is always false
            System.out.println("This is an unreachable if branch.");
        }
        
        if (matcher.find()) {
            return "Match found: " + matcher.group();
        } else {
            return "No match found";
        }
    }

    private boolean getCondition() {
        return false; // The method returns false making the if statement unreachable
    }

    public static void main(String[] args) {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("abc");
        System.out.println(result);
    }
}