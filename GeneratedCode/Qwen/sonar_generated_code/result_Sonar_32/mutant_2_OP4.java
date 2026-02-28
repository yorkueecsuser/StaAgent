import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBackReferenceBug {

    // Method to demonstrate the bug with numeric back reference
    public String showBug1() {
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        boolean shouldRun = getCondition();
        if (matcher.find()) {
            return matcher.group();
        } else if (shouldRun) {
            // Unreachable if-else branch
            return "Unreachable";
        }
        return "No match";
    }

    // Method to demonstrate the bug with undefined numeric back reference
    public String showBug2() {
        Pattern pattern = Pattern.compile("(.)\\2"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        boolean shouldRun = getCondition();
        if (matcher.find()) {
            return matcher.group();
        } else if (shouldRun) {
            // Unreachable if-else branch
            return "Unreachable";
        }
        return "No match";
    }

    // Method to demonstrate the bug with back reference in different branches
    public String showBug3() {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        boolean shouldRun = getCondition();
        if (matcher.find()) {
            return matcher.group();
        } else if (shouldRun) {
            // Unreachable if-else branch
            return "Unreachable";
        }
        return "No match";
    }

    // Method to demonstrate the bug with named back reference in different branches
    public String showBug4() {
        Pattern pattern = Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        boolean shouldRun = getCondition();
        if (matcher.find()) {
            return matcher.group();
        } else if (shouldRun) {
            // Unreachable if-else branch
            return "Unreachable";
        }
        return "No match";
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically at runtime
    }
}