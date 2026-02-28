class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(message);

        // Inserting an unreachable switch statement
        // This switch will never get executed because condition is set to a value that is not in any case
        int unreachableValue = calculateUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            default:
                // Default case to handle any other values, but it will not be reached
                System.out.println("This is also unreachable.");
                break;
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

    private static int calculateUnreachableValue() {
        // Method to determine the value, which results in the switch statement being unreachable
        // Choose a value that is never matched in the switch cases
        return 0;
    }

    public static void main(String[] args) {
        showBug();
    }
}