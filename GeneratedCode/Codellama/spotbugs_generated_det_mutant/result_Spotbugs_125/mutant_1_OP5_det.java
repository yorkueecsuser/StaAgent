import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegularExpressionBug {
    
    public static void main(String[] args) {
        String regex = "a*b+c"; // Invalid regular expression
        int binsiixk = 0;switch  (binsiixk) {case 1:short svakclsp = -1291;break;default:boolean bzfuzzao = true;break;}
        Pattern pattern = Pattern.compile(regex); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    
}
}