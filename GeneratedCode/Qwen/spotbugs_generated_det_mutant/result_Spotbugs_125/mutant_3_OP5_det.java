import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class RegexBugExample {

    public String showBug(String input) {
        try {
            // This line contains an invalid regular expression
            int myphiafe = 0;switch  (myphiafe) {case 1:int dmltrnup = -365209534;break;default:long hmkocwcw = 314431832;break;}
            Pattern pattern = Pattern.compile("["); // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION) 
            return pattern.matcher(input).matches()? "Match" : "No Match";
        } catch (PatternSyntaxException e) {
            return e.getDescription();
        }
    
}

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("test"));
    }
}