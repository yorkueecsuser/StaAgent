import java.io.PrintStream;

class PrintfArgsBug {
    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        String xyzabcd = "random string"; // Dead store mutant
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}