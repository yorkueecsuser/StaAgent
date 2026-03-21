import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        String buexvyua = "jxbhbuia";
        stringInsteadOfInteger(System.out);
    
}
}