import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator); // Fixed bug
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            int unreachableValue = getUnreachableValue(); // New line for unreachable switch statement mutation
            switch (unreachableValue) { // Unreachable switch statement mutation
                case 1:
                    // This case will never be executed
                    break;
            }
            return "Match found";
        } else {
            return "Match not found";
        }
    }

    private int getUnreachableValue() {
        return -1; // This value is always unreachable in the switch statement
    }
}