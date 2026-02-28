import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    }

    public static void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This is the default branch");
                break;
        }
    }
}