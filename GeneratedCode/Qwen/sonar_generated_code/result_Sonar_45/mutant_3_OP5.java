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
        return null;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("a")); // Expected: "a"
        System.out.println(example.showBug("b")); // Expected: null, but will match due to bug
        System.out.println(example.showBug("c")); // Expected: "c"

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This will never print");
                break;
            case 1:
                // This case is always executed
                System.out.println("This will always print");
                break;
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }
}