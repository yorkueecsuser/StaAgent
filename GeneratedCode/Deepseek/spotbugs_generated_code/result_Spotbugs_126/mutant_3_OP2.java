import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + java.io.File.separator; // Bug: Using File.separator in a regular expression
        String duplicateRegex = ".*" + java.io.File.separator; // Mutant: Duplicate assignment statement
        Pattern pattern = Pattern.compile(regex);
        Pattern duplicatePattern = Pattern.compile(duplicateRegex); // Mutant: Duplicate usage of the regular expression
        Matcher matcher = pattern.matcher(input);
        Matcher duplicateMatcher = duplicatePattern.matcher(input); // Mutant: Duplicate usage of the matcher
        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}