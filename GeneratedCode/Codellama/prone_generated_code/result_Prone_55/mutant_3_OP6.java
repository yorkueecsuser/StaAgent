import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    }

    // Unreachable for loop mutant
    public static void showBugWithMutant() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        System.out.println(message);
    }
}