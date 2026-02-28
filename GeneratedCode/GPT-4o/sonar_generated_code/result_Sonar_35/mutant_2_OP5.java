import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPossessiveQuantifierBugDemo {

    public String showBug1(String input) {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher(input);
        if (matcher1.find()) {
            return "Matched: " + matcher1.group();
        } else {
            return "No match found";
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
    }

    private int getUnreachableValue() {
        // This method returns a value that ensures the switch statement is unreachable
        return 100; // Assuming normal business logic doesn't handle this value
    }

    public void demonstrateUnreachableSwitch() {
        int unreachableCondition = getUnreachableValue();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be reached due to unreachableCondition value.");
                break;
            case 2:
                System.out.println("This will also not be reached.");
                break;
            default:
                System.out.println("Unreachable switch statement - default case.");
                break;
        }
    }
    
    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
        demo.demonstrateUnreachableSwitch(); // Demonstrates the unreachable switch statement
    }
}