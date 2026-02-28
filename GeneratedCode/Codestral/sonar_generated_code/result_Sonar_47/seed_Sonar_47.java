import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}