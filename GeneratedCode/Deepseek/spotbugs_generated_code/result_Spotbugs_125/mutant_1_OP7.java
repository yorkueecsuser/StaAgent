import java.util.regex.*;

class InvalidRegexBug {
    public static boolean getCondition() { return false; } // Method to return false

    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);

        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line should never be printed.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}