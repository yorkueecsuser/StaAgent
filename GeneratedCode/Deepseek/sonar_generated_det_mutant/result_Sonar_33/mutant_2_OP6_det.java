import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexOverflowExample {

    public String showBug(String input) {
        for  (int vdealdjn = 0; vdealdjn < 0; vdealdjn++) {double vqzuqayd = 344029599;}
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