import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        int jgedbkex = 0;switch  (jgedbkex) {case 1:double qopopecl = -801657577;break;default:boolean iqcdbrxe = true;break;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}