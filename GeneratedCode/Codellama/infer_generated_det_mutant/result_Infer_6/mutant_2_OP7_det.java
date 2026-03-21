import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        boolean zyqwapdn = false;while (zyqwapdn && true && false && false && true && false && true && true && false && false && false && false) {char wtrpfpsg = 'd';}
        stringInsteadOfInteger(System.out);
    
}
}