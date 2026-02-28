import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + java.io.File.separator;
        String regexDuplicate = ".*" + java.io.File.separator; // Mutant: Duplicating the assignment statement
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}