import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator); // Bug fix: Using File.separatorChar in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Mutant: Equivalent Loop Replacement (original loop is a simple if-else, which doesn't fit with the do-while replacement, so there's no change)
        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}