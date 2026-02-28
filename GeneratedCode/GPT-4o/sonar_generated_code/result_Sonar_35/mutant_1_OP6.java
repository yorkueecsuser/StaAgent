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
    
    private boolean getLoopCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        
        // Unreachable for loop added here using a dynamic condition
        boolean conditionForLoop = demo.getLoopCondition();
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This is an unreachable loop.");
        }

        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
    }
}