import java.util.regex.Pattern;

class RegularExpressionBug {
    public static boolean isFalse() {
        return false;
    }

    public static String showBug(String input) {
        for (int i = 0; isFalse(); i++) {
            // Unreachable for loop
            System.out.println("This loop is unreachable");
        }

        String result = input.replaceAll("\\(\\[(", "{"); // BUG: Regular expressions should be syntactically valid
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}