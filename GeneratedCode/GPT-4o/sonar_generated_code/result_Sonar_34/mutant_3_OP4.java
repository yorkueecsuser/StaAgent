import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        // Unreachable if-else statement added as per mutation operator
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable and should never be executed.");
        } else {
            System.out.println("This branch is always executed.");
        }
        
        return matcher.find();
    }

    // Helper method to ensure the if condition is dynamically determined
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}