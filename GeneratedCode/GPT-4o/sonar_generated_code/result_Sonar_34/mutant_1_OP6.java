import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        // Introduce an unreachable for loop with a dynamically determined condition
        boolean conditionFor = getCondition(); // This method should return false to make the loop unreachable
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }
        
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    // Method to determine the condition for the loop, ensuring it is unreachable
    private boolean getCondition() {
        return false; // This makes the loop condition always false, but determined at runtime
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}