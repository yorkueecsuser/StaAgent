import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPossessiveQuantifierBugDemo {

    private boolean getUnreachableCondition() {
        return false; // This method returns a fixed condition that makes any branch using it unreachable.
    }

    public String showBug1(String input) {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher(input);
        if (matcher1.find()) {
            return "Matched: " + matcher1.group();
        } else {
            return "No match found";
        }

        // Unreachable if-else statement
        if (getUnreachableCondition()) {
            return "This is unreachable code for Bug1";
        } else {
            return "This is the else part of unreachable code for Bug1";
        }
    }

    public String showBug2(String input) {
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher2 = pattern2.matcher(input);
        if (matcher2.find()) {
            return "Matched: " + matcher2.group();
        } else {
            return "No match found";
        }

        // Unreachable if-else statement
        if (getUnreachableCondition()) {
            return "This is unreachable code for Bug2";
        } else {
            return "This is the else part of unreachable code for Bug2";
        }
    }
    
    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
    }
}