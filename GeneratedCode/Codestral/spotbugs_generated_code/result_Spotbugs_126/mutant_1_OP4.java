import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator); // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean shouldRun = false;
        if (shouldRun) { // Unreachable if-else statement mutation
            System.out.println("This line will never execute");
        } else {
            if (matcher.matches()) {
                return "Match found";
            } else {
                return "Match not found";
            }
        }
    }
}