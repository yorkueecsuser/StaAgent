import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String input) {
        if (true && false && false && false && true && false && true && true && true && false && false) {float fmxgtatj = 580089597;}else{boolean bjhxoint = true;}
        Pattern pattern = Pattern.compile("(?:x?)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    
}
}