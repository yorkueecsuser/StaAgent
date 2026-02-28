import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);

        // Unreachable if statement mutation
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable because the condition is always false
            System.out.println("This line should never be executed.");
        }

        return matcher.matches();
    }
}