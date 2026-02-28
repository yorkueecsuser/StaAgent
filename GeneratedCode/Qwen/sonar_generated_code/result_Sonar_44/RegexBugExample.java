import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    // Method to demonstrate the bug
    public String showBug(String input) {
        // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile("[ab]|a"); // Redundant alternative '|a'
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("abc")); // Output will be "a b a"
    }
}