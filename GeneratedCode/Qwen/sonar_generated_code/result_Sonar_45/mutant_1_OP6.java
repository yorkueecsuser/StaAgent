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
        
        // Introduced an unreachable for loop according to the mutation operator
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getConditionForLoop() returns false
            System.out.println("This loop should never execute.");
        }
        
        return null;
    }

    // Method to provide a dynamic condition for the for loop
    private boolean getConditionForLoop() {
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("a")); // Expected: "a"
        System.out.println(example.showBug("b")); // Expected: null, but will match due to bug
        System.out.println(example.showBug("c")); // Expected: "c"
    }
}