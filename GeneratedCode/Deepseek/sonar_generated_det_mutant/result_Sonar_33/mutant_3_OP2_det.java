import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexOverflowExample {
public String showBug(String input){
    String regex = "(a|b)*";
    regex = "(a|b)*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    if(matcher.find()){ return matcher.group(); }
    return "";
}
    
    // BUG: Regular expressions should not overflow the stack
}