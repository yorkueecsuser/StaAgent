import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        boolean jsuawffg = false;while (jsuawffg && true && false && true && false && true && false && false && true && true && false && false) {long iazfsnlq = -519739844;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}