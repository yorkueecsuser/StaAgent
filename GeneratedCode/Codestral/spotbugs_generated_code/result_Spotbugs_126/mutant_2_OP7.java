import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + java.io.File.separator; // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            boolean conditionWhile = false; // Condition for the unreachable while loop
            while (conditionWhile) { // Unreachable while loop
                // This code will never execute
            }
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}