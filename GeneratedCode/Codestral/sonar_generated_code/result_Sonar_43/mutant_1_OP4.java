import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{");

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = falseMethodCall(); // Using a non-final variable or method call
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("Unreachable code executed!");
        } else {
            // This branch is always executed
            System.out.println("Reachable code executed!");
        }

        return result;
    }

    private static boolean falseMethodCall() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}