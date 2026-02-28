import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable while loop.");
        }

        return matcher.find();
    }

    // Method to simulate a condition that returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}