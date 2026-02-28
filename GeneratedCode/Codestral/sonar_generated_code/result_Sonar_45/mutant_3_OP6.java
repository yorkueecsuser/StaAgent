import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Unreachable if-else statement
        if (isFalse()) {
            System.out.println("This code will never be executed.");
        } else {
            // Original code
            Pattern pattern = Pattern.compile("^a|b|c$");
            return pattern.matcher(input).matches();
        }
    }

    private boolean isFalse() {
        return false;
    }
}