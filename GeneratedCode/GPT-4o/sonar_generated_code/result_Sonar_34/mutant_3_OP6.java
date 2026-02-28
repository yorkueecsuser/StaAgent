import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);

        // Inserting an unreachable for loop according to the mutation operator
        boolean conditionFor = getCondition(); // This ensures the loop is unreachable
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }

        return matcher.find();
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }

    // Method to ensure the for loop condition is false at runtime
    private boolean getCondition() {
        return false;
    }
}