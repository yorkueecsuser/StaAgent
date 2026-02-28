import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        // Introduced an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return "This will never be executed";
        } else {
            return "Neither will this";
        }

        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));
    }
}