import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + java.io.File.separator; // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean neverTrue = getCondition();
        while (neverTrue) { // Unreachable while loop
            // This loop is unreachable as the condition is always false
        }
        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }

    private boolean getCondition() {
        return false;
    }
}