import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String a) { // BUG: Variable 'input' renamed to 'a'
        String result = a.replaceAll("\\(\\[(", "{"); // Regular expressions should be syntactically valid
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}