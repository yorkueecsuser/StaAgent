class LenientFormatStringExample {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String message = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
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

    public static void main(String[] args) {
        showBug();
    }
}

// Mutant Code
class LenientFormatStringExampleMutant {

    public static void showBug() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String msg = customLenientFormatMutant("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(msg);
    }

    private static String customLenientFormatMutant(String fmt, Object... argz) {
        // Mimics a lenient formatting method like the ones seen in Guava
        // Only replaces %s and ignores other format specifiers
        String rslt = fmt;
        for (Object arg : argz) {
            rslt = rslt.replaceFirst("%s", arg.toString());
        }
        return rslt;
    }

    public static void main(String[] args) {
        showBug();
    }
}