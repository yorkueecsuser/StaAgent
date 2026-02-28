import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    public String showBug(String input) {
        // Mutant: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            switch (0) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
            }
        }

        String regex = ".*" + java.io.File.separator; // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}