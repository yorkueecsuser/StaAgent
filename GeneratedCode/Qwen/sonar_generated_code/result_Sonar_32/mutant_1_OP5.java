import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBackReferenceBug {

    // Method to demonstrate the bug with numeric back reference
    public String showBug1() {
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
        }
    }

    // Method to demonstrate the bug with undefined numeric back reference
    public String showBug2() {
        Pattern pattern = Pattern.compile("(.)\\2"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
        }
    }

    // Method to demonstrate the bug with back reference in different branches
    public String showBug3() {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
        }
    }

    // Method to demonstrate the bug with named back reference in different branches
    public String showBug4() {
        Pattern pattern = Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
        }
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }
}