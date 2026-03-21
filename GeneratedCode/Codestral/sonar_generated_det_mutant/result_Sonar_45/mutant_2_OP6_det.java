import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AlternativeRegexBug {
    public boolean showBug(String input) {
        for  (int ogvjjsnv = 0; ogvjjsnv < 0; ogvjjsnv++) {String ymafafcg = "zhyanxrx";}
        Pattern pattern = Pattern.compile("^a|b|c$"); // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    
}

    public static void main(String[] args) {
        AlternativeRegexBug buggyCode = new AlternativeRegexBug();
        System.out.println(buggyCode.showBug("b")); // This should return false, but it returns true due to the bug
    }
}