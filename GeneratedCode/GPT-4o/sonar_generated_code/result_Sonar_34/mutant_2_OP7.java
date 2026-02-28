import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        boolean conditionWhile = getCondition(); // Method call to ensure non-constant condition
        while (conditionWhile) {
            // This loop is unreachable as conditionWhile is set to false by getCondition()
            System.out.println("This is an unreachable while loop");
            // Breaking out immediately to avoid infinite loop in case the condition changes
            break;
        }
        
        return matcher.find();
    }

    private boolean getCondition() {
        return false; // Always returns false, making while loop unreachable
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}