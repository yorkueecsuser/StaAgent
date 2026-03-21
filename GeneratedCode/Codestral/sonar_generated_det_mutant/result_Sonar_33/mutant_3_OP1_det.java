import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        byte elqipvfi = 20;
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}