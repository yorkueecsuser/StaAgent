import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);

        // Mutant: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line will never be executed.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}