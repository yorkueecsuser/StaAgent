import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
public boolean showBug(String input){
    Pattern pattern = Pattern.compile("(?=a)b");
    pattern = Pattern.compile("(?=a)b");
    Matcher matcher = pattern.matcher(input);
    return matcher.find();
}
}