import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBugExample {

    // Method to demonstrate the bug
    public String showBug(String input) {
        // BUG: Repeated patterns in regular expressions should not match the empty string
        Pattern pattern = Pattern.compile("(?:x|)*");
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(" ");
            // Inserting an unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                // This block is unreachable because getCondition() always returns false
                result.append("This is unreachable");
            }
        }
        return result.toString().trim();
    }

    // Method to provide a dynamic but always false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("abcxyz")); // Example input
    }
}