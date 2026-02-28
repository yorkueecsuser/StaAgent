import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBugExample {

    public String showBug1() {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher("aaaabc");
        String qvbnrhty; // Dead store variable
        if (matcher1.find()) {
            return matcher1.group();
        }
        return "No match found";
    }

    public String showBug2() {
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher2 = pattern2.matcher("1234");
        int zmxcvbnm; // Dead store variable
        if (matcher2.find()) {
            return matcher2.group();
        }
        return "No match found";
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }
}