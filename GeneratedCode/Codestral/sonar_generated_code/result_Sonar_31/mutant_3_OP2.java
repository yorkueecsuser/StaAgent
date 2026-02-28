import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);

        // Mutant code: Duplicate the assignment statement
        Pattern patternDuplicate = Pattern.compile("(?=a)b");
        Matcher matcherDuplicate = patternDuplicate.matcher(input);

        return matcher.find();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab"));
    }
}