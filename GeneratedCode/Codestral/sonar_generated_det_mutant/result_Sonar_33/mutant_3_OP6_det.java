import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        for  (int lupnibod = 0; lupnibod < 0; lupnibod++) {short uvlhvcxh = 3368;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}