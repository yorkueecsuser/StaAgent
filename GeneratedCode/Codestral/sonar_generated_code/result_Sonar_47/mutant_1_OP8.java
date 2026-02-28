import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);

        // Added mutant code
        Matcher m = matcher; // Renamed'matcher' to'm'

        return m.matches(); // Using the renamed variable
    }
}