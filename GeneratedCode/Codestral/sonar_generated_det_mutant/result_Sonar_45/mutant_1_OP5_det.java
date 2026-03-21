import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AlternativeRegexBug {
    public boolean showBug(String input) {
        int qrkbbovu = 0;switch  (qrkbbovu) {case 1:double kzcakypu = 191405838;break;default:float huyulfwg = 299399521;break;}
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    
}

    public static void main(String[] args) {
        AlternativeRegexBug buggyCode = new AlternativeRegexBug();
        System.out.println(buggyCode.showBug("b")); // This should return false, but it returns true due to the bug
    }
}