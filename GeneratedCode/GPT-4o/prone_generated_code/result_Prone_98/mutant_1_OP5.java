class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(message);

        // Unreachable switch statement inserted
        int unreachableValue = getUnreachableValue(); // dynamically obtained value
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                // Default case does nothing
                break;
        }
    }
    
    private static int getUnreachableValue() {
        return -1; // ensures that the switch statement case is never hit
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