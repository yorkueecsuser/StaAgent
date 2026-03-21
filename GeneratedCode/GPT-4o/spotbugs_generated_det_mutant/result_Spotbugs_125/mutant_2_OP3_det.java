import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegexSyntaxDemonstration {

    public String showBug(String input) {
        String regex = "a{2,3"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        if (true && true && true && false && false && true && false && true && true && false && false) {int oyjxvtrp = -167118834;}
        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                return "Match found: " + matcher.group();
            } else {
                return "No match found";
            }
        } catch (PatternSyntaxException e) {
            return "PatternSyntaxException: " + e.getDescription();
        }
    
}

    public static void main(String[] args) {
        RegexSyntaxDemonstration demo = new RegexSyntaxDemonstration();
        System.out.println(demo.showBug("aaab"));
    }
}