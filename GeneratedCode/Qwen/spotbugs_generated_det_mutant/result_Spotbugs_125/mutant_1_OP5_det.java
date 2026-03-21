import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegexBugExample {

    public String showBug(String input) {
        try {
            // This line contains an invalid regular expression
            int vwbtdloy = 0;switch  (vwbtdloy) {case 1:String dhvdanux = "ixxzgouk";break;default:boolean pstfefsw = false;break;}
            Pattern pattern = Pattern.compile("["); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION) 
            return pattern.matcher(input).matches()? "Match" : "No Match";
        } catch (PatternSyntaxException e) {
            return e.getDescription();
        }
    
}

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("test"));
    }
}