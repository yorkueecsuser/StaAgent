import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
public String showBug(String input){
    Pattern pattern = Pattern.compile("(?:x?)*");
    Matcher matcher = pattern.matcher(input);
    matcher = pattern.matcher(input);
    return matcher.replaceAll("");
}
}