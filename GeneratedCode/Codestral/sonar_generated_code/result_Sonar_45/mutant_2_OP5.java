import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Buggy line
        Pattern pattern = Pattern.compile("^a|b|c$");

        // Mutated code: Adding an unreachable switch statement
        int value = getValue(); // Assume getValue() is a method that returns an integer value
        switch (value) {
            case 0: // This case will never be reached
                System.out.println("Unreachable code");
                break;
        }

        return pattern.matcher(input).matches();
    }

    // Dummy method to return a value for the switch statement
    private int getValue() {
        return -1; // This ensures that the switch statement will not enter any case
    }
}