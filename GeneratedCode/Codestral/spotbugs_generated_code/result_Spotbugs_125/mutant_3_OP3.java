import java.util.regex.*;

class InvalidRegexBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        if (getFalseCondition()) {
            // Unreachable if statement mutation
            Pattern.compile(pattern);
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}