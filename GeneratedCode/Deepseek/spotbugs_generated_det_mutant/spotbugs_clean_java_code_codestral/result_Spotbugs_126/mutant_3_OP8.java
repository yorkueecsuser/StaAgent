import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + java.io.File.separator; // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String result; // Mutation: Renaming'result' to 'finalOutput'
        if (matcher.matches()) {
            result = "Match found";
        } else {
            result = "Match not found";
        }
        return result;
    }
}