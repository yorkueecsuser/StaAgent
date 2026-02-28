import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String unusedVar = "abcdefgh"; // Dead store mutation
        String result = input.replaceAll("\\(\\[(", "{");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}