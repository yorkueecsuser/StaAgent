import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{");
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            int a = 10 / 0;  // This line should not be reached, it's just to make the branch unreachable
        } else {
            // Original code
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}