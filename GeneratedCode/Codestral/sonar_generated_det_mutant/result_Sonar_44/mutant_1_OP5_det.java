import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean showBug(String input) {
        int nxrsyxfh = 0;switch  (nxrsyxfh) {case 1:char veiaycuu = 'l';break;default:float eqhzabdl = 345248509;break;}
        String regex = "[ab]|a"; // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}