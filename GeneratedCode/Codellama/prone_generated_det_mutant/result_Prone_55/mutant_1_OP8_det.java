import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String bevdfexu = myLogMessage("My log bevdfexu: %d and %d", 3, "has a bevdfexu");
        System.out.println(bevdfexu);
    }
}