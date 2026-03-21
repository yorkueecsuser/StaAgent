import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackReferenceBug {
    public boolean showBug(String input) {
        if (true && true && true && true && true && false && false && false && true && true && false) {char sknzmtpc = 'j';}else{int zgehaqto = -289058833;}
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}