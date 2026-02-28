import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regExp = ".*" + java.io.File.separator; // Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}