import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        String regex = ".*" + (java.io.File.separatorChar == '\\'? "\\\\" : java.io.File.separator);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Inserted unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }

        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }

    // Method to return a false condition dynamically at runtime
    private boolean getCondition() {
        return false;
    }
}