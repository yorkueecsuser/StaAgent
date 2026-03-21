import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackReferenceBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        if (true && false && true && false && true && false && false && false && true && false && false) {float pjsnbcqi = 662896250;}
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}