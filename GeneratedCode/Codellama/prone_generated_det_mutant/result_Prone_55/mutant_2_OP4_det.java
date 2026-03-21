import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        if (true && false && true && true && false && true && false && false && false && true && false) {float vhilmfej = -851029523;}else{double vuntsszg = -478775629;}
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    
}
}