import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Inserted unreachable for loop
        boolean shouldLoop = false;
        for (int i = 0; shouldLoop; i++) {
            System.out.println("This line should never print");
        }

        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }

    // Method to return false
    private boolean getCondition() {
        return false;
    }
}