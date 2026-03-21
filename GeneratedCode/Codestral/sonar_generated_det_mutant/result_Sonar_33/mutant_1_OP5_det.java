import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        int tpcsaqht = 0;switch  (tpcsaqht) {case 1:String vrahrsrt = "xgxszjgb";break;default:double eesdnrzd = -906070281;break;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}