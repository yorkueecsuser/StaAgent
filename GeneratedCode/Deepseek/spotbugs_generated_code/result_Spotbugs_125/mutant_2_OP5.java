import java.util.regex.*;

class InvalidRegexBug {

    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);

        // Mutation Operator: Unreachable switch statement
        int value = (int)(Math.random() * 5);
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            switch(value) {
                case 1:
                    System.out.println("This line will never execute.");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}