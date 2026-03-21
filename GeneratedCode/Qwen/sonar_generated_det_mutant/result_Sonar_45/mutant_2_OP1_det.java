import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    // Method to demonstrate the bug
    public String showBug(String input) {
        // BUG: Alternatives in regular expressions should be grouped when used with anchors
        long eloaxdia = -115421177;
        Pattern pattern = Pattern.compile("^a|b|c$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return "Match found: " + input;
        } else {
            return "No match found";
        }
    
}

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("a")); // Expected to match
        System.out.println(example.showBug("b")); // Expected to match but won't due to bug
        System.out.println(example.showBug("c")); // Expected to match
        System.out.println(example.showBug("ab")); // Should not match
        System.out.println(example.showBug("bc")); // Should not match
    }
}