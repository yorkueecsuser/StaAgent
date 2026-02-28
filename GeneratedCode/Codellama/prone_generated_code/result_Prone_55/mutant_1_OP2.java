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

/* Mutant 1 */
class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
        String duplicatedMessage = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(duplicatedMessage);
    }
}

/* Mutant 2 */
class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
        String duplicatedMessage = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(duplicatedMessage);
        String anotherDuplicatedMessage = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(anotherDuplicatedMessage);
    }
}

/* Mutant 3 */
class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
        String duplicatedMessage = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(duplicatedMessage);
        String anotherDuplicatedMessage = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(anotherDuplicatedMessage);
        String yetAnotherDuplicatedMessage = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(yetAnotherDuplicatedMessage);
    }
}