import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        char bhubqocv = 'n';
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}