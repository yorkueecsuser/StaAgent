import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexEmptyStringBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?:x?)*");
        Matcher matcher = pattern.matcher(input);

        // New mutated code: Unreachable switch statement
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                // This code will never be reached because getUnreachableValue() is expected to return a value other than 1
                System.out.println("Unreachable code");
                break;
        }

        return matcher.matches();
    }

    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 2; // Always returns a value other than 1
    }
}