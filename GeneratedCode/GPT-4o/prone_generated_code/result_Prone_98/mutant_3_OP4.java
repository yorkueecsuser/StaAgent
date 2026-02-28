class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(message);

        // Mutant code: Unreachable if-else statement
        // The condition is dynamically determined at runtime
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This block is unreachable because condition is always false.");
        } else {
            System.out.println("This block is always executed.");
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

    private static boolean getCondition() {
        // Always returns false to make the if block unreachable, but avoids compile-time constant
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}