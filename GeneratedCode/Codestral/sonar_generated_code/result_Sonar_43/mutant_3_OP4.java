import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        boolean shouldReplace = falseCondition(); // Mutant: Unreachable if-else statement
        if (shouldReplace) { // Added unreachable if-else branch
            String result = input.replaceAll("\\(\\[(", "{");
            return result;
        } else {
            return input; // Unreachable else branch
        }
    }

    private static boolean falseCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}