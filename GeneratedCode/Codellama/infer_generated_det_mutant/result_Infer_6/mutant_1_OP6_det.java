import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        for  (int taeazonx = 0; taeazonx < 0; taeazonx++) {double bczhzfdm = 462206528;}
        stringInsteadOfInteger(System.out);
    
}
}