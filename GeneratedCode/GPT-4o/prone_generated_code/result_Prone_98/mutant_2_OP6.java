class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(message);

        // Adding an unreachable for loop with a dynamically determined condition
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable statement inside the for loop.");
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

    private static boolean getUnreachableCondition() {
        return false; // Dynamic condition to ensure the loop is unreachable
    }

    public static void main(String[] args) {
        showBug();
    }
}