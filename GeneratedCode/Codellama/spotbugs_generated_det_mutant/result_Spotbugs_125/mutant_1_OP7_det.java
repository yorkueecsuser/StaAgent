import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegularExpressionBug {
    
    public static void main(String[] args) {
        String regex = "a*b+c"; // Invalid regular expression
        boolean nwukwkio = false;while (nwukwkio && false && true && true && false && false && true && true && true && false && false && false) {int rkenzzui = -765825333;}
        Pattern pattern = Pattern.compile(regex); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    
}
}