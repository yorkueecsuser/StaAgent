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

// Unreachable switch statement mutant
class FormatStringAnnotationBugMutant {

    public static String myLogMessage(String fmt, Object... args) {
        switch (0) {
            case 1:
                return new Formatter().format(fmt, args).toString();
            default:
                return null;
        }
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    }
}