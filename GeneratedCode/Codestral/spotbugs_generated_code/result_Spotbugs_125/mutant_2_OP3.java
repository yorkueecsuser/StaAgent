import java.util.regex.*;

class InvalidRegexBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);

        // Mutant code (Unreachable if statement)
        if (getCondition()) {
            // Unreachable code block
            System.out.println("This code should never execute!");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}