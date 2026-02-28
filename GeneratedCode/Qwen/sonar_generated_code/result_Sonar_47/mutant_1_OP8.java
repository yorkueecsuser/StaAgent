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
        }
        return result.toString().trim();
    }

    // Mutated method with renamed variable
    public String showBug(String a) {
        // BUG: Repeated patterns in regular expressions should not match the empty string
        Pattern b = Pattern.compile("(?:x|)*");
        Matcher c = b.matcher(a);
        StringBuilder d = new StringBuilder();
        while (c.find()) {
            d.append(c.group()).append(" ");
        }
        return d.toString().trim();
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("abcxyz")); // Example input
        System.out.println(example.showBug("abcxyz")); // Example input using mutated method
    }
}