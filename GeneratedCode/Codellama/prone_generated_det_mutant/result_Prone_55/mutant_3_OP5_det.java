import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        int tcntfqjo = 0;switch  (tcntfqjo) {case 1:char ghcwxskw = 'g';break;default:byte gmlrwome = 8;break;}
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    
}
}