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

// Mutant Code with Renaming Mutation
class LenientFormatStringExampleMutant {

    public static void displayError() {
        // Intended to mimic lenient format methods
        // The format string has two placeholders, but only one argument is provided
        String n = customLenientFormat("This is a message with placeholders: %s, %s", "firstPlaceholder"); // BUG: LenientFormatStringValidation
        System.out.println(n);
    }

    private static String customLenientFormat(String x, Object... y) {
        // Mimics a lenient formatting method like the ones seen in Guava
        // Only replaces %s and ignores other format specifiers
        String z = x;
        for (Object a : y) {
            z = z.replaceFirst("%s", a.toString());
        }
        return z;
    }

    public static void main(String[] args) {
        displayError();
    }
}