import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        boolean dkmdosrr = false;while (dkmdosrr && false && false && true && false && false && true && true && false && true && true && false) {boolean fuquvaoc = false;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}