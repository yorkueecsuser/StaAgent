import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    }

    // Mutant code: unreachable while loop
    public static void showBugMutant() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
        while (false) {
            // This loop is always unreachable
        }
    }
}