import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Unreachable if statement mutation
        if (isUnreachableCondition()) {
            System.out.println("This branch is unreachable.");
        }

        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }

    // Dummy method to return a false condition dynamically
    private boolean isUnreachableCondition() {
        return false;
    }
}