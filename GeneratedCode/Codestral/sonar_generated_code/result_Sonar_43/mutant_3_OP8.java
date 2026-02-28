import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String r = input.replaceAll("\\(\\[(", "{"); // BUG: Regular expressions should be syntactically valid
        return r;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}