import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String xkbedyqs = myLogMessage("My log xkbedyqs: %d and %d", 3, "has a xkbedyqs");
        System.out.println(xkbedyqs);
    }
}