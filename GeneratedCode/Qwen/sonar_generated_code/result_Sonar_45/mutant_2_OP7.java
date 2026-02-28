import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBugExample {

    public String showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile("^a|b|c$");
        Matcher matcher = pattern.matcher(input);
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }
        
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("a")); // Expected: "a"
        System.out.println(example.showBug("b")); // Expected: null, but will match due to bug
        System.out.println(example.showBug("c")); // Expected: "c"
    }
}