class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(message);

        // Introduce a non-final variable for the switch statement condition
        int unreachableSwitchCondition = getUnreachableSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 99: // This case will never be reached because the condition will not evaluate to 99
                System.out.println("This is an unreachable switch case.");
                break;
            // No default case needed as this is meant to be unreachable
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

    private static int getUnreachableSwitchCondition() {
        // This method returns a value that will not match any case in the switch statement
        return -1; // Ensures that the switch case 99 is never reached
    }

    public static void main(String[] args) {
        showBug();
    }
}