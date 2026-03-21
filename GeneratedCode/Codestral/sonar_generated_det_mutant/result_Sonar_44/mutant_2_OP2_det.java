import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RedundantRegexAlternatives {
public boolean showBug(String input){
    String regex = "[ab]|a";
    regex = "[ab]|a";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    return matcher.matches();
}
}