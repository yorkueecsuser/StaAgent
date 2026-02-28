import java.util.regex.Pattern;

class RegularExpressionBug {
    public static boolean getCondition() {
        return false;
    }

    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{"); // BUG: Regular expressions should be syntactically valid
        while (getCondition()) { // Unreachable while loop
            // This loop will never execute as the condition is always false
            System.out.println("This is an unreachable loop");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}