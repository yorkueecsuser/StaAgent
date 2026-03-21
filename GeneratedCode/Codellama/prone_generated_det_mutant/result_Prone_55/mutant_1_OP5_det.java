import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        int vypvaumx = 0;switch  (vypvaumx) {case 1:long pldnasfw = -516208789;break;default:byte rttxnfpy = -64;break;}
        System.out.println(message);
    
}
}