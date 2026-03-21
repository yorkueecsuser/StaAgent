import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        if (true && false && false && true && true && true && true && true && true && true && false) {long vwbrekix = 438956042;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}