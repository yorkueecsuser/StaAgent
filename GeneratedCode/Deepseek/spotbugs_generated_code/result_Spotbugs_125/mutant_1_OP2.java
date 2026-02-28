import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        String patternDuplicate = "[a-zA-Z0-9\\"; // Mutated code: Duplication of the assignment statement
        Pattern.compile(pattern);
        Pattern.compile(patternDuplicate); // Using the duplicated variable
    }

    public static void main(String[] args) {
        showBug();
    }
}