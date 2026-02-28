class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        
        // Introducing a mutant: an unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This message is unreachable.");
        }
        
        System.out.println(message);
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

    // Helper method to ensure the condition is not a compile-time constant
    private static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}