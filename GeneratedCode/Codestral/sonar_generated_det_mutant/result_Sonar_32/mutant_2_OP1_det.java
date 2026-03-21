import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackReferenceBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        byte pwdpwmci = 94;
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}