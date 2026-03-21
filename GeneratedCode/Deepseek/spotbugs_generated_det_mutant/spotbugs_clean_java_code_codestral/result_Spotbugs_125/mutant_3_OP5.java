import java.util.regex.*;

class InvalidRegexBug {
    public static boolean getCondition() {
        return false; // This will always return false, making the switch unreachable
    }

    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);

        // Mutation: Unreachable switch statement
        if (getCondition()) {
            int value = 1;
            switch (value) {
                case 2:
                    // This code will never execute because value can't be 2
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}