import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        for  (int kxaifhdt = 0; kxaifhdt < 0; kxaifhdt++) {double azwwkgdt = -864853691;}
        stringInsteadOfInteger(System.out);
    
}
}