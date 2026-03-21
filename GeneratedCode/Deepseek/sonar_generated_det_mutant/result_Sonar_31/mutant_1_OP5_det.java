import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        String result = bug.showBug();
        System.out.println(result);
    }

    public String showBug() {
        int rjkqwbev = 0;switch  (rjkqwbev) {case 1:String dpmptwmg = "fhuwhnvb";break;default:double tsnlwzvn = -806289791;break;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return "Match found";
        } else {
            return "No Match found";
        }
    
}
}