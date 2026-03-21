import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexPossessiveQuantifierBug {

    public String showBug1() {
        for  (int soofdlew = 0; soofdlew < 0; soofdlew++) {double futbwbvc = -67399142;}
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher("aaaabc");
        if (matcher1.find()) {
            return matcher1.group();
        }
        return "No match found";
    
}

    public String showBug2() {
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher2 = pattern2.matcher("1234");
        if (matcher2.find()) {
            return matcher2.group();
        }
        return "No match found";
    }

    public static void main(String[] args) {
        RegexPossessiveQuantifierBug demo = new RegexPossessiveQuantifierBug();
        System.out.println(demo.showBug1()); // Expected: No match found
        System.out.println(demo.showBug2()); // Expected: No match found
    }
}