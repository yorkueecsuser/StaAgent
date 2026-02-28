import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBugExample {

    public String showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because getCondition() always returns false
            return "unreachable";
        } else {
            // This block is also unreachable due to the same reason
            return "also unreachable";
        }

        return null;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("a")); // Expected: "a"
        System.out.println(example.showBug("b")); // Expected: null, but will match due to bug
        System.out.println(example.showBug("c")); // Expected: "c"
    }
}