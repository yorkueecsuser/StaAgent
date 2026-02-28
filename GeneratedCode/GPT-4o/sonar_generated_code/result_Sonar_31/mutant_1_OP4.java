import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexLookaheadBugDemo {

    public String showBug(String input) {
        // This pattern attempts to match 'b' only if it is preceded by 'a',
        // but because the lookahead is contradictory, it will never match anything.
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            return "Match found: " + matcher.group();
        } else {
            return "No match found";
        }
    }
    
    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexLookaheadBugDemo demo = new RegexLookaheadBugDemo();
        String result = demo.showBug("abc");
        System.out.println(result);
        
        // Inserted unreachable if-else branch
        boolean condition = demo.getCondition();
        if (condition) {
            System.out.println("This is an unreachable block.");
        } else {
            System.out.println("This is a reachable block.");
        }
    }
}