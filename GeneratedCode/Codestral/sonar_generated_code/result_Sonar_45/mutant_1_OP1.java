import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Buggy line, should be "^(?:a|b|c)$"
        Pattern pattern = Pattern.compile("^a|b|c$");

        // Dead store mutation
        int abcdefgh = 10; // This variable is not used in the code

        return pattern.matcher(input).matches();
    }
}