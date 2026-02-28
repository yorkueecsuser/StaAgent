import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        // Unreachable if-else branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch will never be executed.");
        } else {
            System.out.println("This is the always executed branch.");
        }

        return matcher.find();
    }
    
    private boolean getFalseCondition() {
        // This method can be dynamically modified to return true if needed
        return false;
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}