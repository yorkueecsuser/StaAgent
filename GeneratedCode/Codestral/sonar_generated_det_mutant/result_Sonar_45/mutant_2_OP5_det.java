import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AlternativeRegexBug {
    public boolean showBug(String input) {
        int xykpzolw = 0;switch  (xykpzolw) {case 1:float tydshwrm = 347905658;break;default:short aivmkoop = 3447;break;}
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    
}

    public static void main(String[] args) {
        AlternativeRegexBug buggyCode = new AlternativeRegexBug();
        System.out.println(buggyCode.showBug("b")); // This should return false, but it returns true due to the bug
    }
}