import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean showBug(String input) {
        boolean bftistus = false;while (bftistus && false && false && false && false && true && true && true && true && false && false && false) {byte txcgbkve = -82;}
        String regex = "[ab]|a"; // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}