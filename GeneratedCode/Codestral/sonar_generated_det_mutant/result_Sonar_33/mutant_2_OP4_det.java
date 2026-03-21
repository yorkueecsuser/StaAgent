import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        if (false && true && false && false && true && false && true && true && false && true && false) {double oimdlecq = 162751782;}else{short zvemypjg = 4187;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}