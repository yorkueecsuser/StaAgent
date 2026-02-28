class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(message);

        // Inserting unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is never reached.");
        } else {
            // This is the reachable branch
            System.out.println("Unreachable if-else statement example.");
        }
    }

    private static boolean getUnreachableCondition() {
        // Method to provide a condition that is always false
        // This ensures that the if-else branch above is unreachable
        return false;
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

    public static void main(String[] args) {
        showBug();
    }
}