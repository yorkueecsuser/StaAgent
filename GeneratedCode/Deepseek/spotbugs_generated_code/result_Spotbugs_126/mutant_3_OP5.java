import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSeparatorBug {
    private int unreachableValue() {
        return Integer.MAX_VALUE;
    }

    public String showBug(String input) {
        String regex = ".*" + java.io.File.separator; // Bug: Using File.separator in a regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Inserted unreachable switch statement
        int value = unreachableValue();
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        if (matcher.matches()) {
            return "Match found";
        } else {
            return "Match not found";
        }
    }
}