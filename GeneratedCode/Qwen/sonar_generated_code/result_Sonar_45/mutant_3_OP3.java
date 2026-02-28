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

        // Inserting an unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable statement");
        }

        return null;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("a")); // Expected: "a"
        System.out.println(example.showBug("b")); // Expected: null, but will match due to bug
        System.out.println(example.showBug("c")); // Expected: "c"
    }
}