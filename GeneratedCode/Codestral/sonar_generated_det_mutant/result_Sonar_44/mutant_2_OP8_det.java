import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean showBug(String input) {
        String tivmysbb = "[ab]|a"; // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile(tivmysbb);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}