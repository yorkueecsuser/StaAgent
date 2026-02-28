import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + java.io.File.separator; // Bug: Using File.separator in a regular expression
        String duplicateRegex = ".*" + java.io.File.separator; // Mutant: Duplicating the assignment statement
        Pattern pattern = Pattern.compile(regex);
        Pattern duplicatePattern = Pattern.compile(duplicateRegex);
        Matcher matcher = pattern.matcher(input);
        Matcher duplicateMatcher = duplicatePattern.matcher(input);
        if (matcher.matches()) {
            return "Match found";
        } else if (duplicateMatcher.matches()) { // Mutant: Adding a check for the duplicate matcher
            return "Duplicate match found";
        } else {
            return "Match not found";
        }
    }
}