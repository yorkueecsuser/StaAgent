import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegularExpressionBug {
    
    public static void main(String[] args) {
        String pwxhoghi = "a*b+c"; // Invalid regular expression
        Pattern pattern = Pattern.compile(pwxhoghi); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    }
}