import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
        // Add unreachable switch statement mutant
        switch (false) {
            case 1:
                System.out.println("Reachable case");
                break;
            case 2:
                System.out.println("Unreachable case");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}