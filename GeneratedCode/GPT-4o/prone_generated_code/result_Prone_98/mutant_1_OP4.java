class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(message);

        // Mutation: Insert an unreachable if-else statement
        boolean condition = determineCondition(); // A non-final variable to ensure it's not a compile-time constant
        if (condition) {
            // This block is unreachable because condition will always be false
            System.out.println("Unreachable code");
        } else {
            // This block will always execute
            System.out.println("This block is always executed");
        }
    }

    private static String customLenientFormat(String format, Object... args) {
        // Mimics a lenient formatting method like the ones seen in Guava
        // Only replaces %s and ignores other format specifiers
        String result = format;
        for (Object arg : args) {
            result = result.replaceFirst("%s", arg.toString());
        }
        return result;
    }

    // Helper method to ensure a dynamic condition
    private static boolean determineCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        showBug();
    }
}