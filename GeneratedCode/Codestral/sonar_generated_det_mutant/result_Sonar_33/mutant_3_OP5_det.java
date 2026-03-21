import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        int kcxyluhd = 0;switch  (kcxyluhd) {case 1:String aezgovhr = "onzcreld";break;default:boolean rbzbvyzo = false;break;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}