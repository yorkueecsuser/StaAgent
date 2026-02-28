import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        // Unreachable switch statement mutant
        int x = getConstantZero();
        switch (x) {
            case 1:
                System.out.println("This should never be printed.");
                break;
        }

        String result = input.replaceAll("\\(\\[(", "{");
        return result;
    }

    // Method to return a constant zero
    private static int getConstantZero() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}