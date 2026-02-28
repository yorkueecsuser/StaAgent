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
            // Inserting unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                result.append("This will run");
            } else {
                result.append("This will never run");
            }
        }
        return result.toString().trim();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true; // This ensures the if branch is taken and the else branch is unreachable
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("abcxyz")); // Example input
    }
}