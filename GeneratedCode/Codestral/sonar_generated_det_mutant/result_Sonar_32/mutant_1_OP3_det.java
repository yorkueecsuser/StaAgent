import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackReferenceBug {
    public boolean showBug(String input) {
        if (true && false && false && true && false && true && false && false && false && false && false) {double brnxsaom = 765639144;}
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}