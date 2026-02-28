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
    
    // Mutated method with renamed user-defined variable
    public String showBug1_mutant(String input) {
        Pattern z = Pattern.compile("a++abc"); // Renamed pattern1 to z
        Matcher matcher1 = z.matcher(input);
        if (matcher1.find()) {
            return "Matched: " + matcher1.group();
        } else {
            return "No match found";
        }
    }

    // Mutated method with renamed user-defined variable
    public String showBug2_mutant(String input) {
        Pattern y = Pattern.compile("\\d*+[02468]"); // Renamed pattern2 to y
        Matcher matcher2 = y.matcher(input);
        if (matcher2.find()) {
            return "Matched: " + matcher2.group();
        } else {
            return "No match found";
        }
    }
    
    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug

        // Testing mutated methods
        System.out.println(demo.showBug1_mutant("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2_mutant("123456")); // Expected to show the bug
    }
}