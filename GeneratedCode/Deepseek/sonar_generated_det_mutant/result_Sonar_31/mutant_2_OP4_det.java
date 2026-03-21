import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        String result = bug.showBug();
        System.out.println(result);
    }

    public String showBug() {
        if (true && false && false && false && false && true && false && false && false && true && false) {short twyihyub = -3547;}else{char oxkdctwb = 't';}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return "Match found";
        } else {
            return "No Match found";
        }
    
}
}