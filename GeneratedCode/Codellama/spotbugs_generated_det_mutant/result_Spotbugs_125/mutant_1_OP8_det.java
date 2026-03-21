import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegularExpressionBug {
    
    public static void main(String[] args) {
        String ocuswhzd = "a*b+c"; // Invalid regular expression
        Pattern pattern = Pattern.compile(ocuswhzd); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    }
}