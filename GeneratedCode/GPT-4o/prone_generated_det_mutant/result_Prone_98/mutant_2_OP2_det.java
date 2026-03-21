class LenientFormatStringExample {
public static void showBug() {
    String message = customLenientFormat("This is a message with placeholders: %s, %s" , "firstPlaceholder");
    message = customLenientFormat("This is a message with placeholders: %s, %s" , "firstPlaceholder");
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