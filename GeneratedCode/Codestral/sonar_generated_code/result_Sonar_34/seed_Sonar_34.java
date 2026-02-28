import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        // BUG: Regex boundaries should not be used in a way that can never be matched
        Pattern pattern = Pattern.compile("$[a-z]+^");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}