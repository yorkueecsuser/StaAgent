import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern p = Pattern.compile("(?:x?)*");
        Matcher m = p.matcher(input);
        return m.matches();
    }
}