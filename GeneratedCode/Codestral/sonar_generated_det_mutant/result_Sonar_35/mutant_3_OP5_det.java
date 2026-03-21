import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        int btupipbp = 0;switch  (btupipbp) {case 1:byte xowwqegp = 49;break;default:int pflpiwqq = 915500898;break;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}