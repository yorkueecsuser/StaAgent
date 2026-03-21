import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        boolean jhpnxrke = false;while (jhpnxrke && false && true && true && true && false && true && false && false && false && true && false) {double dnrtmtni = 805085163;}
        System.out.println(message);
    
}
}