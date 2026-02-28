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
        // This method returns a value that will make the switch statement unreachable
        return -1; // Assuming only positive values are used in the switch cases elsewhere
    }

    public void unreachableSwitchExample() {
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be executed");
                break;
            case 2:
                System.out.println("Neither will this");
                break;
            default:
                System.out.println("And not this");
                break;
        }
    }
    
    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
        
        // Call the method containing the unreachable switch statement
        demo.unreachableSwitchExample();
    }
}