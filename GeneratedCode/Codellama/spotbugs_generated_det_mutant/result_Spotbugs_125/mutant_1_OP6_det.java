import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegularExpressionBug {
    
    public static void main(String[] args) {
        String regex = "a*b+c"; // Invalid regular expression
        for  (int zilapxds = 0; zilapxds < 0; zilapxds++) {long acorrgid = -68179338;}
        Pattern pattern = Pattern.compile(regex); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    
}
}