import java.util.regex.*;

class InvalidRegexBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);

        // Mutant code: Unreachable switch statement
        int value = getCondition()? 1 : 0;
        switch (value) {
            case 2: // This case is unreachable, as value will never be 2
                System.out.println("Unreachable code");
                break;
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}