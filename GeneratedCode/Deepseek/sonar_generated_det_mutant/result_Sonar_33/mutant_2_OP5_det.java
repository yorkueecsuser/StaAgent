import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexOverflowExample {

    public String showBug(String input) {
        int vslnvbjz = 0;switch  (vslnvbjz) {case 1:float zcnrtrkw = 835113461;break;default:String crfxncom = "qyoxztit";break;}
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