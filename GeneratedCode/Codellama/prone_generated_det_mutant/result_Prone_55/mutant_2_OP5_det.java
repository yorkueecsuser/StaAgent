import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        int zukzgwji = 0;switch  (zukzgwji) {case 1:boolean gsewzome = true;break;default:char afpkcbqj = 'c';break;}
        System.out.println(message);
    
}
}