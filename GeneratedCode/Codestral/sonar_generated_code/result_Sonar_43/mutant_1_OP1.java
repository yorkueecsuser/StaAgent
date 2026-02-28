import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String unusedVariable = "deadstore"; // Dead store: Unused variable declaration
        String result = input.replaceAll("\\(\\[(", "{"); // BUG: Regular expressions should be syntactically valid
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}