import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern p = Pattern.compile("(?:x?)*"); // Renamed variable 'pattern' to 'p'
        Matcher m = p.matcher(input); // Updated the variable name in the matcher declaration
        return m.matches();
    }
}