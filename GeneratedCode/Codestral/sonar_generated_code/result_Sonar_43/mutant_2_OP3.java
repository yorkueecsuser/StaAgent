import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{"); // BUG: Regular expressions should be syntactically valid

        // Mutant: Unreachable if statement
        boolean alwaysFalseCondition = isFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable");
        }

        return result;
    }

    // Method to return a false condition
    private static boolean isFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}