import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String input) {
        String regex = ".*" + java.io.File.separator; // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            return "Match found";
        } else {
            // The following if-else branch is unreachable because the condition is always false
            if (getUnreachableCondition()) {
                throw new IllegalStateException("This code should not be reached");
            } else {
                return "Match not found";
            }
        }
    }
}