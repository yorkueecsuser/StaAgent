import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        // Dead Store Mutation
        String unusedVariable = "abcdefgh";

        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}