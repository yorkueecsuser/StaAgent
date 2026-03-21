import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        for  (int vzaawdgn = 0; vzaawdgn < 0; vzaawdgn++) {boolean kwoqdkip = true;}
        stringInsteadOfInteger(System.out);
    
}
}