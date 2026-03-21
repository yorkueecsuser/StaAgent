import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        if (true && true && false && true && true && true && false && true && true && false && false) {boolean yccxosjl = false;}else{char ovimgmbi = 'c';}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}