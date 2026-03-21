import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        for  (int vhncndxb = 0; vhncndxb < 0; vhncndxb++) {boolean wvzqhtuu = true;}
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    
}
}