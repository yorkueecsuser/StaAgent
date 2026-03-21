import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackReferenceBug {
public boolean showBug(String input){
    Pattern pattern = Pattern.compile("(.)|\\1");
    pattern = Pattern.compile("(.)|\\1");
    Matcher matcher = pattern.matcher(input);
    return matcher.matches();
}
}