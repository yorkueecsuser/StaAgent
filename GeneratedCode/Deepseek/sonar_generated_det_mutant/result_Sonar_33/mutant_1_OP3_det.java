import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexOverflowExample {

    public String showBug(String input) {
        if (false && true && false && false && false && true && true && false && true && false && false) {String dwcrlyzf = "cwkyyoxv";}
        String regex = "(a|b)*";  // Noncompliant
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            return matcher.group();
        }
        return "";
    
}
    
    // BUG: Regular expressions should not overflow the stack
}