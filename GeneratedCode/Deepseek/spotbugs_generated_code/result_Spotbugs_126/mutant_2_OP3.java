import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar=='\\'? "\\\\" : java.io.File.separator); // Original bug remains
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Unreachable if statement inserted
        if (checkUnreachableCondition()) {
            // This code block should never execute
            System.out.println("Unreachable code executed!");
        }

        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }

    // Method to generate a false value at runtime for the unreachable condition
    private boolean checkUnreachableCondition() {
        return false;
    }
}