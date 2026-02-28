import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPossessiveQuantifierBugDemo {

    public String showBug1(String input) {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher(input);
        if (matcher1.find()) {
            return "Matched: " + matcher1.group();
        } else {
            // Adding unreachable switch statement
            int unreachableSwitchValue = getUnreachableSwitchValue();
            switch (unreachableSwitchValue) {
                case 1:
                    return "Unreachable case 1";
                default:
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
            // Adding unreachable switch statement
            int unreachableSwitchValue = getUnreachableSwitchValue();
            switch (unreachableSwitchValue) {
                case 2:
                    return "Unreachable case 2";
                default:
                    return "No match found";
            }
        }
    }
    
    private int getUnreachableSwitchValue() {
        return 0; // This method ensures that the switch statement cases remain unreachable
    }

    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
    }
}