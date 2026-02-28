import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);

        // Mutant code - Duplication of the assignment statement
        Matcher matcherDuplicate = pattern.matcher(input);

        return matcher.matches();
    }
}