import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator); // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        boolean matched = false;

        // Equivalent Loop Replacement: Replacing while loop with a do-while loop
        do {
            matcher = pattern.matcher(input);
            if (matcher.matches()) {
                matched = true;
            }
        } while (false);

        if (matched) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}