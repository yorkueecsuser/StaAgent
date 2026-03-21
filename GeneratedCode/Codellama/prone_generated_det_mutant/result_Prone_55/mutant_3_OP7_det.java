import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        boolean tnqbesmj = false;while (tnqbesmj && true && true && false && false && true && true && false && false && true && true && false) {long nuxvamyn = -315915909;}
        System.out.println(message);
    
}
}