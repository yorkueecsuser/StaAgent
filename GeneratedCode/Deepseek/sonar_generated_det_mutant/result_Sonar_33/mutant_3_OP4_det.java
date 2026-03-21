import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexOverflowExample {

    public String showBug(String input) {
        if (true && false && true && false && false && false && true && true && true && true && false) {String ecfouzzx = "gqwiehlb";}else{short wmoiyadj = -2092;}
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