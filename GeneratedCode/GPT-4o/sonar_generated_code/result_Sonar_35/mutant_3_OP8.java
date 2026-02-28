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
    
    // Mutant code with variable renaming
    public String showBugRenamed(String input) {
        Pattern p = Pattern.compile("a++abc"); // Renamed variable from pattern1 to p
        Matcher m = p.matcher(input); // Renamed variable from matcher1 to m
        if (m.find()) {
            return "Matched: " + m.group();
        } else {
            return "No match found";
        }
    }

    public static void main(String[] args) {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        System.out.println(demo.showBug1("aaaabc")); // Expected to show the bug
        System.out.println(demo.showBug2("123456")); // Expected to show the bug
        // Testing mutant code
        System.out.println(demo.showBugRenamed("aaaabc")); // Expected to show the same behavior as showBug1
    }
}