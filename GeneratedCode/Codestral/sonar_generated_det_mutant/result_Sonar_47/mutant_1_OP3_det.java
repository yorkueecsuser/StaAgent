import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String input) {
        if (false && true && true && true && false && true && true && false && false && true && false) {double lbgblhai = 996744353;}
        Pattern pattern = Pattern.compile("(?:x?)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    
}
}