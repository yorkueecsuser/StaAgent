import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        // Introduce a variable to simulate a condition for the while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block is unreachable due to the condition being false
            System.out.println("This block is unreachable.");
        }
        
        return matcher.find();
    }
    
    // Method that returns a runtime-evaluated condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}