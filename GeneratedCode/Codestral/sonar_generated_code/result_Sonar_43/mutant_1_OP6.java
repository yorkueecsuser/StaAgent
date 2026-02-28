import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; i < 1; i++) {
                // Unreachable for loop
            }
        }

        String result = input.replaceAll("\\(\\[(", "{"); // BUG: Regular expressions should be syntactically valid
        return result;
    }

    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}