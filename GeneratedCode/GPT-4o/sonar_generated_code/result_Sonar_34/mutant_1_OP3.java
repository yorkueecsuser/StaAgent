import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        // Unreachable if statement mutant added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }

        return matcher.find();
    }

    // Method to provide a condition, ensuring it's not a compile-time constant
    private boolean getCondition() {
        return false; // This makes the if statement's code block unreachable
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}