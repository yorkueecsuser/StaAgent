import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        int jtyeoxbg = -249923540;
        stringInsteadOfInteger(System.out);
    
}
}