import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPossessiveQuantifierBugDemo {

    public String showBug1(String input) {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher(input);
        if (matcher1.find()) {
            return "Matched: " + matcher1.group();
        } else {
            boolean condition = getDynamicCondition();
            if (condition) {
                // This block is unreachable as condition is always false
                return "Unreachable Code";
            } else {
                return "No match found";
            }
        }
    }

    public String showBug2(String input) {
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher2 = pattern2.matcher(input);
        if (matcher2.find()) {
            return "Matched: " + matcher2.group();
        } else {
            boolean condition = getDynamicCondition();
            if (condition) {
                // This block is unreachable as condition is always false
                return "Unreachable Code";
            } else {
                return "No match found";
            }
        }
    }

    // A method to simulate a dynamically determined condition that is always false
    private boolean getDynamicCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
    }
}