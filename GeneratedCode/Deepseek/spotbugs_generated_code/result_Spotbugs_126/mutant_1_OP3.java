import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar=='\\'? "\\\\" : java.io.File.separator); // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean shouldRun = getCondition();
        if (shouldRun) {
            /* Unreachable if branch */
            if (false) {
                System.out.println("This is unreachable");
            }
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