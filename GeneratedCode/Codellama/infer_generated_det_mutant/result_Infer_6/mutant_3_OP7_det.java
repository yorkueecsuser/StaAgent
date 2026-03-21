import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        boolean swfukncx = false;while (swfukncx && false && false && true && false && false && false && true && true && false && false && false) {char wpbdfvfn = 'q';}
        stringInsteadOfInteger(System.out);
    
}
}