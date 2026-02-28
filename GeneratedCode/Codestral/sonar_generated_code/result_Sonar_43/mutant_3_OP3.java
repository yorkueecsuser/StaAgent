import java.util.regex.Pattern;

class RegularExpressionBug {
    public static boolean getCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{");

        // Inserted unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}