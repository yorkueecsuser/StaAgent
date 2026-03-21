import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String unusedVar = "deadstore"; // Dead Store mutation: Unused variable declaration
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator); // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}