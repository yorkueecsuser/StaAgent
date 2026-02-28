import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return "This will never be executed";
        } else {
            return "Neither will this";
        }

        return "No match found";
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));
    }
}