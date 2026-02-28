import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{"); // Original code
        String resultDuplicate = result; // Mutated code: Duplication of the assignment statement
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}