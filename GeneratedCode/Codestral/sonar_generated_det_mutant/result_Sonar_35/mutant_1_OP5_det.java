import java.util.regex.Pattern;

class RegexPossessiveBug {
    public boolean showBug(String input) {
        int htmoaqif = 0;switch  (htmoaqif) {case 1:float kieolwhf = -95688698;break;default:String ljasuzxm = "exciqbmm";break;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern.matcher(input).matches();
    
}
}