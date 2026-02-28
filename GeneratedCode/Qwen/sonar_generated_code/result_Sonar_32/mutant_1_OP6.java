import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBackReferenceBug {

    // Method to demonstrate the bug with numeric back reference
    public String showBug1() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() will always return false
        }
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";
    }

    // Method to demonstrate the bug with undefined numeric back reference
    public String showBug2() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() will always return false
        }
        Pattern pattern = Pattern.compile("(.)\\2"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";
    }

    // Method to demonstrate the bug with back reference in different branches
    public String showBug3() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() will always return false
        }
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";
    }

    // Method to demonstrate the bug with named back reference in different branches
    public String showBug4() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() will always return false
        }
        Pattern pattern = Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }
}