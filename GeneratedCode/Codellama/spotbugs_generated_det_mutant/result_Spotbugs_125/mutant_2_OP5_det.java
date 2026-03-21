import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegularExpressionBug {
    
    public static void main(String[] args) {
        String regex = "a*b+c"; // Invalid regular expression
        int vbpuuosa = 0;switch  (vbpuuosa) {case 1:byte kfquvdur = 111;break;default:char bvlydjpt = 'w';break;}
        Pattern pattern = Pattern.compile(regex); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    
}
}