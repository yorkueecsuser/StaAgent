import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPossessiveQuantifierBugDemo {

    public String showBug1(String input) {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher(input);
        if (matcher1.find()) {
            return "Matched: " + matcher1.group();
        } else {
            // Unreachable for loop mutation
            boolean conditionFor = getFalseCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This is unreachable code block inside showBug1.");
            }
            return "No match found";
        }
    }

    public String showBug2(String input) {
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher2 = pattern2.matcher(input);
        if (matcher2.find()) {
            return "Matched: " + matcher2.group();
        } else {
            // Unreachable for loop mutation
            boolean conditionFor = getFalseCondition();
            for (int j = 0; conditionFor; j++) {
                System.out.println("This is unreachable code block inside showBug2.");
            }
            return "No match found";
        }
    }

    // Helper method to provide a false condition
    private boolean getFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
    }
}