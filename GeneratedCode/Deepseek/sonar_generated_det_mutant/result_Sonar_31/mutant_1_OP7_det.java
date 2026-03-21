import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBug {
    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        String result = bug.showBug();
        System.out.println(result);
    }

    public String showBug() {
        boolean qbuluygu = false;while (qbuluygu && true && false && false && false && false && false && true && false && false && true && false) {boolean suytunpe = false;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return "Match found";
        } else {
            return "No Match found";
        }
    
}
}