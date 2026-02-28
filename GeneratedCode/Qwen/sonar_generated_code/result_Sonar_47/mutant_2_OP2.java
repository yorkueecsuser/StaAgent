import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBugExample {

    // Method to demonstrate the bug
    public String showBug(String input) {
        // BUG: Repeated patterns in regular expressions should not match the empty string
        Pattern pattern = Pattern.compile("(?:x|)*");
        Pattern patternCopy = Pattern.compile("(?:x|)*"); // Duplicate assignment
        Matcher matcher = pattern.matcher(input);
        Matcher matcherCopy = pattern.matcher(input); // Duplicate assignment
        StringBuilder result = new StringBuilder();
        StringBuilder resultCopy = new StringBuilder(); // Duplicate assignment
        while (matcher.find()) {
            result.append(matcher.group()).append(" ");
        }
        while (matcherCopy.find()) { // Using the duplicated matcher
            resultCopy.append(matcherCopy.group()).append(" "); // Using the duplicated result
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("abcxyz")); // Example input
    }
}