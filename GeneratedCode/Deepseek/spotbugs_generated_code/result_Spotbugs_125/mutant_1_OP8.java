import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        String mutatedPattern = "mutatedPattern"; // Mutant: Renaming the variable
        Pattern.compile(mutatedPattern);
    }

    public static void main(String[] args) {
        showBug();
    }
}