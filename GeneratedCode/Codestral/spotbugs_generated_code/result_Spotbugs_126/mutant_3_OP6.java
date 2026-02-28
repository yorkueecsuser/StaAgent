import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar=='\\'? "\\\\" : java.io.File.separator); // Fixed bug
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Added unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line will never be executed");
        }

        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }

    // Method to prevent the unreachable code error
    private boolean getCondition() {
        return false;
    }
}