import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Introducing a dead store mutation
        int unusedVariable = 10; // Unused variable

        Pattern pattern = Pattern.compile("^a|b|c$"); // Buggy line, should be "^(?:a|b|c)$"
        return pattern.matcher(input).matches();
    }
}