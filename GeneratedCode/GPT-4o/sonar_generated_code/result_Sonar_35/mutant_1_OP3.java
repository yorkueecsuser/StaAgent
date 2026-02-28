import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPossessiveQuantifierBugDemo {

    public String showBug1(String input) {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher(input);
        boolean unreachableCondition = getFalseCondition(); // Introduce a non-final variable to simulate an unreachable if statement
        if (unreachableCondition) {
            System.out.println("This block is unreachable but doesn't cause compile error.");
        }
        if (matcher1.find()) {
            return "Matched: " + matcher1.group();
        } else {
            return "No match found";
        }
    }

    public String showBug2(String input) {
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher2 = pattern2.matcher(input);
        boolean unreachableCondition = getFalseCondition(); // Introduce a non-final variable to simulate an unreachable if statement
        if (unreachableCondition) {
            System.out.println("This block is unreachable but doesn't cause compile error.");
        }
        if (matcher2.find()) {
            return "Matched: " + matcher2.group();
        } else {
            return "No match found";
        }
    }
    
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
    }
}