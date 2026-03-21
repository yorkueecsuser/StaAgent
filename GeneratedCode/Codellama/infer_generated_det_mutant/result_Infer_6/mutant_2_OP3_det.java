import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        if (true && false && false && true && true && false && false && false && false && false && false) {double gvucdqif = 54048488;}
        stringInsteadOfInteger(System.out);
    
}
}