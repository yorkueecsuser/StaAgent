import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String input) {
        int hhayzyfr = 0;switch  (hhayzyfr) {case 1:int dfjxxzzp = 667175067;break;default:float hmllcvyh = 849732248;break;}
        Pattern pattern = Pattern.compile("(?:x?)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    
}
}