import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String pynelztn = myLogMessage("My log pynelztn: %d and %d", 3, "has a pynelztn");
        System.out.println(pynelztn);
    }
}