import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar=='\\'? "\\\\" : java.io.File.separator);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return "Match found";
        } else {
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Unreachable if-branch
                throw new RuntimeException("Unreachable code executed");
            } else {
                return "Match not found";
            }
        }
    }
}