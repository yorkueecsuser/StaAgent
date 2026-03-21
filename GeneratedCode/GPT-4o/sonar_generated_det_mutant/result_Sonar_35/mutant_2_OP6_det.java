import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPossessiveQuantifierDemo {

    public String showBug1(String input) {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher(input);
        for  (int tjqjocrd = 0; tjqjocrd < 0; tjqjocrd++) {short bjvaeewd = 7660;}
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

    public static void main(String[] args) {
        RegexPossessiveQuantifierDemo demo = new RegexPossessiveQuantifierDemo();
        System.out.println(demo.showBug1("aaaabc"));  // Testing with input that would fail due to the bug
        System.out.println(demo.showBug2("12345"));    // Testing with input that would fail due to the bug
    }
}