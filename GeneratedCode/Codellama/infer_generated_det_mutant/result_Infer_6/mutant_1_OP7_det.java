import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        boolean rkfysfnz = false;while (rkfysfnz && true && false && false && false && false && true && true && true && false && false && false) {char cxtckqrc = 'r';}
        stringInsteadOfInteger(System.out);
    
}
}