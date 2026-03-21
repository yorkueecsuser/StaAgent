import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        for  (int guwelrjt = 0; guwelrjt < 0; guwelrjt++) {int twjjlpkb = 908107350;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}