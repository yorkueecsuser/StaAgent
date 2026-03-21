import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegularExpressionBug {
    
    public static void main(String[] args) {
        String regex = "a*b+c"; // Invalid regular expression
        if (false && false && true && false && true && true && true && true && true && true && false) {byte slirrvea = 49;}
        Pattern pattern = Pattern.compile(regex); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    
}
}