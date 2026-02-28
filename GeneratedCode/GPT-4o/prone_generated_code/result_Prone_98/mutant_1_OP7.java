class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(message);
        
        // Unreachable while loop inserted as a mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block is unreachable
            System.out.println("This is unreachable code.");
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
        // Return a dynamic condition that is always false
        return System.currentTimeMillis() < 0; // Always false at runtime
    }

    public static void main(String[] args) {
        showBug();
    }
}