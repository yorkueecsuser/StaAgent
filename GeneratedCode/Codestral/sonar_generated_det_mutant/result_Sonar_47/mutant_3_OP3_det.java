import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String input) {
        if (false && true && true && true && true && true && false && false && false && false && false) {long aiupkcfh = -434740417;}
        Pattern pattern = Pattern.compile("(?:x?)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    
}
}