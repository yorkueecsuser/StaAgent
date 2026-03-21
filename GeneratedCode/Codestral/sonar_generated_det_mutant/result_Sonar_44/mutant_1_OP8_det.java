import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean showBug(String input) {
        String snccmzzd = "[ab]|a"; // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile(snccmzzd);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}