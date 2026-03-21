import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexOverflowExample {

    public String showBug(String input) {
        if (true && false && false && false && false && false && true && false && false && true && false) {byte pbblaowx = 22;}
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