import java.util.regex.Pattern;

class RegularExpressionBug {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{"); // BUG: Regular expressions should be syntactically valid

        // Mutant code: Unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}