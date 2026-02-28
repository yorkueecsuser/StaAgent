import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            boolean conditionWhile = false;
            while (conditionWhile) {
                // This loop will never be executed
                System.out.println("This line is unreachable");
            }
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}