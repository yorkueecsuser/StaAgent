import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{"); // BUG: Regular expressions should be syntactically valid
        String unusedVariable = "deadstore"; // Added dead store variable
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}