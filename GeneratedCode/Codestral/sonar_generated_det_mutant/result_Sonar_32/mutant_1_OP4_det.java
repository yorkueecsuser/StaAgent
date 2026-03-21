import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackReferenceBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        if (false && false && false && true && true && true && true && false && true && false && false) {String knkoxhnh = "byrjoici";}else{float bbluvpkd = 331363650;}
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}