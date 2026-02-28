import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    }
}

// Unreachable if-else statement mutant
class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);

        // Unreachable if-else statement mutant
        if (false) {
            // This branch is always false, making it unreachable
            System.out.println("This message should not be displayed");
        } else {
            // This branch is always true, making the previous branch unreachable
            System.out.println("This message should be displayed");
        }
    }
}