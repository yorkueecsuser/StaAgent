import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean showBug(String input) {
        String itbclvss = "[ab]|a"; // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile(itbclvss);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}