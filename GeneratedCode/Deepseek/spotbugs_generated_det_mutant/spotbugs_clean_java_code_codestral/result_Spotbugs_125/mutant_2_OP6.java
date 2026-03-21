import java.util.regex.*;

class InvalidRegexBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        // MUTATION: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }
        Pattern.compile(pattern);
    }

    public static void main(String[] args) {
        showBug();
    }
}