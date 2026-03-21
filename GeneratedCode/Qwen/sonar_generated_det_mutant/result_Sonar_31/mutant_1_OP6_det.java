import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public String showBug() {
        for  (int eypaqrnh = 0; eypaqrnh < 0; eypaqrnh++) {byte rrqupbnq = 46;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Matcher matcher = pattern.matcher("ab");
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    
}

    public static void main(String[] args) {
        RegexLookaheadBug bugDemo = new RegexLookaheadBug();
        System.out.println(bugDemo.showBug());
    }
}