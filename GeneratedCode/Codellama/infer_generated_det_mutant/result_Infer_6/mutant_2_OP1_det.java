import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        float nqtvxtmq = 81829274;
        stringInsteadOfInteger(System.out);
    
}
}