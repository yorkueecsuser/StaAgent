import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        int owkrurkg = 0;switch  (owkrurkg) {case 1:char mwwevwpp = 'r';break;default:float myqaaryf = 292989713;break;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}