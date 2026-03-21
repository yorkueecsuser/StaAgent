import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        if (true && true && true && true && false && true && false && true && false && false && false) {boolean haeppwyg = true;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}