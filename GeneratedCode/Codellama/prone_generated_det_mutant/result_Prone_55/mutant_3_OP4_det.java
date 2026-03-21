import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        if (false && true && true && true && true && false && false && true && true && true && false) {byte jtanqrky = 75;}else{float tlltiyyr = -671199045;}
        System.out.println(message);
    
}
}