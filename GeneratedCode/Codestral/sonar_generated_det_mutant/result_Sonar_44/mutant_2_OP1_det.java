import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean showBug(String input) {
        int gxoacajk = -841473227;
        String regex = "[ab]|a"; // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}