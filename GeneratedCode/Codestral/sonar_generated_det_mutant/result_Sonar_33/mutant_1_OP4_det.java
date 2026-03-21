import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        if (true && false && false && true && false && true && false && false && false && false && false) {double fepzdnug = -42280240;}else{char pditdlsx = 'b';}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}